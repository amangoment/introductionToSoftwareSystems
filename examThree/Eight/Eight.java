//Write simplest program that creates/shows on the screen a few circles of various colors.

import javax.swing.JFrame; 
import javax.swing.JComponent; 
import java.awt.Graphics;
import java.util.ArrayList; 
import java.awt.Color;

public class Eight extends JComponent {
  ArrayList<Circle> circles = new ArrayList<Circle>(); 

  public Eight() {
    for (int i = 0; i < 30; i++) {
      this.circles.add(new Circle((int)(Math.random()*400), 
                                  (int)(Math.random()*400), 
                                  (int)(Math.random() * 10 + 30),
                                  new Color((float)Math.random(), 
                                            (float)Math.random(), 
                                            (float)Math.random())));  
    }
  }

  public void paintComponent(Graphics g) {
    g.drawOval(40, 40, 100, 100); // likewise, not needed, just a sanity check
    for (Circle c : this.circles)
      c.draw(g); 
    System.out.println("I am being called." + this.circles); // for illustration only 
  }

  public static void main(String[] args) {
    JFrame a = new JFrame(); 
    a.add( new Eight() ); 
    a.setSize(400, 400); 
    a.setVisible(true); 
  }
}