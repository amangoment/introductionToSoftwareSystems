public class Bae {
  public static void main(String[] args) {
    double gpa = 2.8; 
    
    if (1.5 <= gpa) {
      if (gpa <= 2.0) {
        System.out.println("Student on probation."); 
      } else {
        System.out.println("Student in great shape."); 
      }
    } else {
      System.out.println("Student failing."); 
    }
  }
}