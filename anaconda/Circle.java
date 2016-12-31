import java.awt.Color;
import java.awt.Graphics;

public class Circle {
    int x;
    int y;
    int r;
    Color c;

    public Circle(int var1, int var2, int var3, Color var4) {
        this.x = var1;
        this.y = var2;
        this.r = var3;
        this.c = var4;
    }

    public void draw(Graphics var1) {
        var1.setColor(this.c);
        var1.fillOval(this.x - this.r, this.y - this.r, 2 * this.r, 2 * this.r);
        var1.setColor(Color.BLACK);
        var1.drawOval(this.x - this.r, this.y - this.r, 2 * this.r, 2 * this.r);
    }

    public void setColor(Color var1) {
        this.c = var1;
    }
}
