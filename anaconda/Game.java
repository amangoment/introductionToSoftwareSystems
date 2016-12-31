import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Game implements World {
    Snake snake = new Snake();

    public Game() {
    }

    public void teh() {
        this.snake.move();
    }

    public void meh(MouseEvent var1) {
    }

    public void keh(KeyEvent var1) {
        if(var1.getKeyCode() == 37) {
            this.snake.setDirection("west");
        } else if(var1.getKeyCode() == 39) {
            this.snake.setDirection("east");
        } else if(var1.getKeyCode() == 38) {
            this.snake.setDirection("north");
        } else if(var1.getKeyCode() == 40) {
            this.snake.setDirection("south");
        } else {
            System.out.println(var1);
            char var2 = var1.getKeyChar();
            if(var2 == 53) {
                this.snake.setDirection("stop");
            } else if(var2 == 56) {
                this.snake.setDirection("north");
            } else if(var2 == 50) {
                this.snake.setDirection("south");
            } else if(var2 == 52) {
                this.snake.setDirection("west");
            } else if(var2 == 54) {
                this.snake.setDirection("east");
            }
        }

    }

    public void draw(Graphics var1) {
        this.snake.draw(var1);
    }

    public static void main(String[] var0) {
        BigBang var1 = new BigBang(new Game());
        var1.start(200, 400);
    }
}
