import java.awt.Color;
import java.awt.Graphics;

public class Circle {
    int x, y, vx, vy, radius;
    Color c;

    public Circle(int var1, int var2, int var3, int var4, int var5, Color var6) {
        this.x = var1;
        this.y = var2;
        this.vx = var3;
        this.vy = var4;
        this.radius = var5;
        this.c = var6;
    }

    public void draw(Graphics var1) {
        var1.setColor(this.c);
        var1.fillOval(this.x - this.radius, this.y - this.radius, 2 * this.radius, 2 * this.radius);
        var1.setColor(Color.RED);
        var1.drawOval(this.x - this.radius, this.y - this.radius, 2 * this.radius, 2 * this.radius);
    }

    public void move() {
        this.x += this.vx;
        this.y += this.vy;
        this.x = this.x > 400?this.x - 400:(this.x < 0?400 - this.x:this.x);
        this.y = this.y > 400?this.y - 400:(this.y < 0?400 - this.y:this.y);
    }
}
