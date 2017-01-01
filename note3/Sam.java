public class Sam {
  public static void main(String[] args) {
    int[] slots = new int[3]; 
    slots[0] = (int)(Math.random() * 100 - 50); 
    slots[2] = (int)(Math.random() * 100 - 50); 
    System.out.print( slots[0] + " vs. " + slots[2] + ": "); 
    try {
      System.out.print( slots[ 1 + Math.abs(slots[2] - slots[0]) / (slots[2] - slots[0]) ] );  
    } catch (Exception e) { // if we divide by zero we come here 
      // they are equal
      System.out.print( slots[0] ); // or slots[2] doesn't matter 
    }
    System.out.println( " is the max value. " ); 
  }
}