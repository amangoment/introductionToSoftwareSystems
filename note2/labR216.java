//R2.16

import java.awt.Rectangle;
  
public class labR216 {
  public static void main(String[] args) {
                                   // x   y   w   h
    Rectangle square = new Rectangle(10, 20, 40, 40); 
    System.out.println( square ); 
    square.translate(10, 0); 
    // https://docs.oracle.com/javase/8/docs/api/java/awt/Rectangle.html
    System.out.println( square ); 
    // another way:
    // square = new Rectangle(20, 20, 40, 40); 
  }
}