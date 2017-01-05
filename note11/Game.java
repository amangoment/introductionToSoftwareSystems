import javax.swing.JFrame; 
import java.awt.*;
import java.awt.event.*; 

public class Game implements World {
  Circle circle;

  public Game() {
    this.circle = new Circle(200, 200, 30, Color.WHITE);  
  }

  int ticks; 
  public void teh() { 
    this.ticks += 1; 
    // System.out.println( "world reports: " + ticks );
  }

  public void draw(Graphics g) { 
    this.circle.draw(g); 
  } 

  public void meh(MouseEvent e) { 
    System.out.println("Mouse event detected."); 
  }

  public void keh(KeyEvent e) { 
    System.out.println( "You have typed character: " + e.getKeyChar() ); 
    char c = e.getKeyChar(); 
    if (c == 'a') this.circle.move(-5, 0);
    else if (c == 'd') this.circle.move(5, 0); 
  }
  
  public static void main(String[] args) {
     JFrame a = new JFrame(); 
     Game g = new Game(); 
     BigBang b = new BigBang( g ); 
     a.add( b ); 
     a.setVisible(true); 
     a.setSize(400, 400); 
     a.addKeyListener(b); 
  }
}