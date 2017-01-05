import java.util.*;

class Six {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    System.out.print("Enter: ");
    String line = s.nextLine();
    while (! line.equals("bye")) {
      numbers.add( Integer.parseInt( line ) );
      System.out.println( numbers );
      System.out.print("Enter: ");
      line = s.nextLine();
    }
    System.out.print("Here are the numbers sorted: ");
    Collections.sort(numbers);
    System.out.println( numbers );
    int max = numbers.get(numbers.size() - 1); 
    int min = numbers.get(0); 
    System.out.println("Min: " + min + " Max: " + max + " Range: " + (max - min)); 
    double sum = 0; 
    for (Integer number : numbers) sum += number;  
    System.out.println("The average is: " + ( numbers.size() == 0 ? " N/A " : sum/numbers.size()))   ; 
  }
}