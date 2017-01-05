import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class BigBang extends JComponent implements ActionListener, 
                                                   MouseListener, 
                                                   KeyListener {
  Timer timer;
  World world;

  public BigBang(World world) {
    this.world = world; 
    this.timer = new Timer(500, this); 
    this.timer.start(); 
    this.addMouseListener(this); 
    this.addKeyListener(this); 
  }

  public void mouseEntered(MouseEvent e) { }

  public void mouseExited(MouseEvent e) { }

  public void mousePressed(MouseEvent e) { 
    this.world.meh(e); 
    this.repaint(); 
  }

  public void mouseReleased(MouseEvent e) { }

  public void mouseClicked(MouseEvent e) { }

  public void keyPressed(KeyEvent e) { }

  public void keyReleased(KeyEvent e) { }

  public void keyTyped(KeyEvent e) {
    this.world.keh(e);
    this.repaint();
  }

  // int count;
  public void actionPerformed(ActionEvent e) {
    // this.count += 1; 
    // System.out.println("Ouch" + this.count);     
    this.world.teh();
  }
  
  public void paintComponent(Graphics g) {
    this.world.draw(g); 
  }
}