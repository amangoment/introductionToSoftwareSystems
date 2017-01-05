import javax.swing.*; 
import java.awt.event.*; 

public class One implements ActionListener {
  int count; 
  public void actionPerformed(ActionEvent e) {
    this.count += 1; 
    System.out.println("Time passes... " + this.count);
  } 
  public static void main(String[] args) {
    Timer t = new Timer(1000, new One());     
    t.start(); 
  } 
}