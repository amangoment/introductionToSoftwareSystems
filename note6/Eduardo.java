public class Eduardo {
  public static void main(String[] args) {
    System.out.println( args[0] ); 
    int size = Integer.parseInt( args[0] ); 
    int[][] a = new int[size][size]; 
    System.out.println( a ); 
    for (int[] r : a)
      System.out.println( java.util.Arrays.toString( r ) );
    int number = 1, row = size - 1, col = size/2; 
    while (number <= size * size) {
       a[row][col] = number; 
       number = number + 1; 
       if (a[(row+1)%size][(col+1)%size] == 0) {
         row = (row + 1) % size; 
         col = (col + 1) % size; 
       } else {
         row = row - 1;
       }
    for (int[] r : a)
      System.out.println( java.util.Arrays.toString( r ) );
    System.out.println(" ---------------------------- "); 

    }
  }
}