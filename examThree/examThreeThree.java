//Write simplest program that can keep and report time.

import java.awt.event.*; 
import javax.swing.*;

public class Three implements ActionListener {
  public static void main(String[] args) {
    Three three = new Three();
    Timer timer = new Timer(1000, three); 
    timer.start(); 
  }
  int count = 0; 
  public void actionPerformed(ActionEvent e) {
    this.count += 1; 
    System.out.println( this.count ); 
  }
}