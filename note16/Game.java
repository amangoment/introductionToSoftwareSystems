import java.awt.*;
import java.awt.event.*;

public class Game implements World {
  Shape current;
  Ground ground;

  public Game() {
    this.current = new Shape(200, 0); 
    this.ground = new Ground(); 
  }

  public void teh() {
    this.current.fall(); 
    if (current.y >= 400 || this.current.touches( this.ground ) ) {
      this.ground.add( this.current );
      this.current = new Shape(200, 0); 
    }
  }

  public void meh(MouseEvent e) { }

  public void keh(KeyEvent e) {
    int code = e.getKeyCode(); 
    if (code == 37) {
      this.current.left(); 
    } else { 
      this.current.right(); 
    }
  }

  public void draw(Graphics g) {
    System.out.println( this.ground );     
    this.ground.draw( g );    
    this.current.draw( g ); 
  }
  
  public static void main(String[] args) {
    BigBang b = new BigBang(new Game()); 
    b.start(50, 400); 
  }
}
