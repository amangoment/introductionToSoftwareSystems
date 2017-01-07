//Today: Exceptions, Comparators. 

import java.util.*;

public class Six {
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in); 
    System.out.print("Integer: "); 
    String input = a.nextLine(); 
    try { 
      int number = Integer.parseInt( input ); 
      System.out.println( Math.sqrt( number ) ); 
    } catch (Exception e) {
      System.out.println( "Oops." ); 
    }
  }
}
