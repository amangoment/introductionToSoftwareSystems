import java.awt.*;
import java.awt.event.*;

public class Game implements World {
  Shape current; 
  Ground ground; 
  boolean theEnd = false; 
  public boolean hasEnded() {
    return this.theEnd; 
  }
  String message = ""; 
  public void sayBye() {
    this.message = "Game Over!";  
  }
  public Game() {
    this.current = new Shape(200, 0); 
    this.ground = new Ground(); 
  }
  public void teh() {
    this.current.fall(); 
    if (current.y >= 400 || this.current.touches( this.ground ) ) {
      this.ground.add( this.current );
      this.current = new Shape(200, 0); 
      if (this.current.touches( this.ground )) {
        this.theEnd = true;
        this.current = null; 
      }
    }
  }
  public void meh(MouseEvent e) { }
  public void keh(KeyEvent e) {
    if (this.current != null) { 
      int code = e.getKeyCode(); 
      if (code == 37) {
        this.current.left(); 
      } else { 
        this.current.right(); 
      }
    }
  }
  public void draw(Graphics g) {
    if (this.ground != null) this.ground.draw( g );    
    if (this.current != null) this.current.draw( g );     
    if (this.hasEnded()) {
      // g.setColor(Color.RED); 
      g.setFont(new Font("Verdana", Font.PLAIN, 50));
      g.drawString( this.message, 30, 200 );  
      // g.setColor(Color.BLACK); 
    } 
    // System.out.println( this.ground );     

  }
  public static void main(String[] args) {
    BigBang b = new BigBang(new Game()); 
    b.start(50, 430); 
  }
}