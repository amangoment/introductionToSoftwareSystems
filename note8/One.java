// file: One.java

import javax.swing.JFrame;

public class One extends JFrame {
  public One() {
    this.add(new Projector());  
  }
  
  public static void main(String[] args) {
    One a = new One(); 
    a.setVisible(true); 
    a.setSize(400, 500); 
  }
}