import java.util.Scanner; 

public class Eduardo {
  public static void main(String[] args) {
    // System.out.println( args[0] ); 
    Scanner in = new Scanner(System.in); 
    System.out.print("What's the size: ");     
    int size = Integer.parseInt( in.nextLine() ); // args[0] ); 
    int[][] a = new int[size][size]; 
    System.out.println( a ); 
    for (int[] r : a)
      System.out.println( java.util.Arrays.toString( r ) );
    int number = 1, row = size - 1, col = size/2; 
    ...

/*
Now let's do an exercise with Singleton pattern and Voter objects: 
*/

abstract class Voter {
  abstract String vote();
}

class Timothy extends Voter {
  String vote() {
    return "Donald Trump";  
  }
}

class Jackson extends Voter {
  String vote() { return "Jill Stein"; }  
}

/*
Create an array of Voter objects, place a Timothy and a Jackson in it. 

Ask them to vote.
*/