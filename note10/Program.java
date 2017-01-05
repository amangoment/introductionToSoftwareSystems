import javax.swing.JFrame; 
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Program extends JFrame implements KeyListener {
  public void keyPressed(KeyEvent e) { 
    System.out.println( "I am the JFrame..." ); 
    this.board.up(); 
  } 
  public void keyReleased(KeyEvent e) { } 
  public void keyTyped(KeyEvent e) { } 
  Board board = new Board(); 
  public Program() {
    this.add( this.board ); 
    this.addKeyListener(this); 
  }
  public static void main(String[] args) {
    JFrame f = new Program(); 
    f.setVisible(true);
    f.setSize(300, 400); 
  }
}