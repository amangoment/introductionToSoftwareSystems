public class Two {
  public static void main(String[] args) {
    int size = 9; 
    for (int i = 0; i < size; i = i + 1) {
      for (int j = 0; j < size; j = j + 1) {
        if (i == 0 || i == size-1 || j == 0 || i == size/2 && j < size/2)
          System.out.print("* ");  
        else 
          System.out.print("  ");
      }
      System.out.println(); 
    }
  }
}