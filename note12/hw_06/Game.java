import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Game implements World {
    Circle circle;

    public Game() {
        this.circle = new Circle(200, 200, 1, 1, 30, Color.WHITE);
    }

    public void teh() {
        this.circle.move();
    }

    public void draw(Graphics var1) {
        this.circle.draw(var1);
    }

    public void meh(MouseEvent var1) {
        System.out.println("Mouse event detected.");
    }

    public void keh(KeyEvent var1) {
        if(var1.getKeyCode() == 38) {
            --this.circle.vy;
        } else if(var1.getKeyCode() == 40) {
            ++this.circle.vy;
        } else if(var1.getKeyCode() == 37) {
            --this.circle.vx;
        } else if(var1.getKeyCode() == 39) {
            ++this.circle.vx;
        }
    }

    public static void main(String[] var0) {
        BigBang var1 = new BigBang(new Game());
        var1.start(50, 400);
    }
}
