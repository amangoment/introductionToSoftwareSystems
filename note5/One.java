import java.util.Arrays; 
import java.util.Scanner; 

public class One {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);      
    System.out.print("Number: "); 
    int[] numbers = new int[0]; 
    String line = in.nextLine(); 
    while (! line.equals("bye")) {
      int number = Integer.parseInt(line); 
      numbers = Arrays.copyOf( numbers , numbers.length + 1 ); 
      numbers[numbers.length - 1] = number; 
      System.out.println( Arrays.toString( numbers ) );
      System.out.print("Number: "); 
      line = in.nextLine(); 
    }
    System.out.println( Arrays.toString( numbers )); 
    Arrays.sort( numbers ); 
    System.out.println( Arrays.toString( numbers )); 
  }
}