public class One { // worked with Jordan Koontz 
  public static void main(String[] args) {
    int[] frequencies = new int[8 - (-5 - 1)]; // I want random integers in [-5, 8] 
    for (int i = 0; i < 50; i++) {
      int value = One.fun(-5, 8); 
      System.out.print( value + " " ); 
      frequencies[value + 5] += 1; // I calculate the distribution here
    }
    System.out.println("\n" + java.util.Arrays.toString( frequencies )); 
  }
  
  public static int fun(int low, int high) {
    double v = Math.random();
    return (int) ( v * (high - (low - 2)) + (low - 1));  
  }
}