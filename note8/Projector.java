// file: Projector.java

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;

class Projector extends JComponent {
  public void paintComponent(Graphics g) {
    g.setColor(Color.YELLOW); 
    g.fillOval(30, 30, 120, 120); 
    g.setColor(Color.BLUE); 
    g.drawOval(30, 30, 120, 120); 
    g.setColor(Color.RED); 
    g.drawString("How are you?", 50, 80); 
  }
}