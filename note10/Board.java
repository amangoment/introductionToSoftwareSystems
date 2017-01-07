
import javax.swing.JComponent; 
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.Color; 
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Board extends JComponent implements MouseMotionListener, KeyListener {
  int x, y; // instance variable

  public Board() {
    this.addMouseMotionListener( this );  
    this.addKeyListener(this); 
  }

  public void mouseMoved(MouseEvent e) { 
    this.x = e.getX();
    this.y = e.getY(); 
    System.out.println( "(" + x + ", " + y + ")"); 
    repaint();
  }

  public void up() {
    this.y -= 1; 
    repaint();
  }

  public void keyPressed(KeyEvent e) { 
    System.out.println( "Ouch." ); 
  } 

  public void keyReleased(KeyEvent e) { }

  public void keyTyped(KeyEvent e) { }

  public void mouseDragged(MouseEvent e) { 
    System.out.println("Mouse being dragged.");
  }

  int i = 0;
  
  public void paintComponent(Graphics g) {
    int RADIUS = 35; 
    this.i += 1; 
    System.out.println( i + ": Howdy." ); 
    g.setColor(Color.YELLOW); 
    g.fillOval(x-RADIUS, y-RADIUS, 2 * RADIUS, 2 * RADIUS); 
    g.setColor(Color.BLUE);
    g.drawOval(x-RADIUS, y-RADIUS, 2 * RADIUS, 2 * RADIUS); 
    g.setColor(Color.RED);
    g.drawString("(" + x + ", " + y + ")", x - RADIUS + 5, y);
  }
}