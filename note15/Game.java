import java.awt.*;
import java.awt.event.*;

public class Game implements World {
  Cloud c = new Cloud(); 
  Bullet b = new Bullet(200, 400, 10, new Color( 1.0f, 1.0f, 0.0f) ); 
  //                                             red   green blue

  public Game() {
    for (int i = 0; i < 50; i++) {
      this.c.add( new Circle( (int) (Math.random() * 300 + 50) , 
                              (int) (Math.random() * 300 + 50), 
                              (int) (Math.random() * 20 + 10), 
                              new Color((float) Math.random(), 
                                        (float) Math.random(), 
                                        (float) Math.random())));
    }
  }

  public void teh() {
    this.b.move();
    this.c.collide(this.b);
  }

  public void meh(MouseEvent e) { }

  public void keh(KeyEvent e) { }

  public void draw(Graphics g) {
    g.drawRect(0, 0, 400, 400); 
    this.c.draw(g); 
    this.b.draw(g); 
  }
  
  public static void main(String[] args) {
    BigBang b = new BigBang(new Game()); 
    b.start(100, 400); 
  }
}