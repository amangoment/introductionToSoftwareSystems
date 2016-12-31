import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake extends ArrayList<Circle> {
    static final int RADIUS = 5;
    String direction = "stop";

    public Snake() {
        byte var1 = 10;
        this.add(new Circle(200 + 0 * var1, 200 + 0 * var1, var1 / 2, Color.BLUE));
        this.add(new Circle(200 + 0 * var1, 200 + 1 * var1, var1 / 2, Color.RED));
        this.add(new Circle(200 + 0 * var1, 200 + 2 * var1, var1 / 2, Color.RED));
        this.add(new Circle(200 + 0 * var1, 200 + 3 * var1, var1 / 2, Color.RED));
        this.add(new Circle(200 + 0 * var1, 200 + 4 * var1, var1 / 2, Color.RED));
        this.add(new Circle(200 + 1 * var1, 200 + 4 * var1, var1 / 2, Color.RED));
        this.add(new Circle(200 + 2 * var1, 200 + 4 * var1, var1 / 2, Color.RED));
        this.add(new Circle(200 + 3 * var1, 200 + 4 * var1, var1 / 2, Color.RED));
        this.add(new Circle(200 + 3 * var1, 200 + 3 * var1, var1 / 2, Color.RED));
        this.add(new Circle(200 + 3 * var1, 200 + 2 * var1, var1 / 2, Color.RED));
        this.add(new Circle(200 + 4 * var1, 200 + 2 * var1, var1 / 2, Color.RED));
        this.add(new Circle(200 + 5 * var1, 200 + 2 * var1, var1 / 2, Color.RED));
    }

    public void draw(Graphics var1) {
        for(int var2 = this.size() - 1; var2 >= 0; --var2) {
            ((Circle)this.get(var2)).draw(var1);
        }
    }

    public void setDirection(String var1) {
        this.direction = var1;
    }

    public void move() {
        if(":north:east:west:south:".contains(this.direction)) {
            int var1 = ((Circle)this.get(0)).x;
            int var2 = ((Circle)this.get(0)).y;
            byte var3 = 10;
            if(this.direction.equals("north")) {
                this.add(0, new Circle(var1 + 0, var2 - var3, var3 / 2, Color.BLUE));
            } else if(this.direction.equals("east")) {
                this.add(0, new Circle(var1 + var3, var2 + 0, var3 / 2, Color.BLUE));
            } else if(this.direction.equals("south")) {
                this.add(0, new Circle(var1 + 0, var2 + var3, var3 / 2, Color.BLUE));
            } else if(this.direction.equals("west")) {
                this.add(0, new Circle(var1 - var3, var2 + 0, var3 / 2, Color.BLUE));
            }

            ((Circle)this.get(1)).setColor(Color.RED);
            this.remove(this.size() - 1);
        }

    }
}
