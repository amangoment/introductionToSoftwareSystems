public class Wednesday {
  public static void main(String[] args) {
    int[][] a = 
    { 
      {1, 2}, 
      {3, 4, 5, 6, 7},
      {8, 9, 10}
    };
    System.out.println( Wednesday.deppToString(a) ); 
  }
  
  public static String deppToString(int[][] a) {
    String answer = ""; 
    for (int[] row : a) {
      if (answer.equals("")) 
        answer = answer + "[\n  " + java.util.Arrays.toString(row); 
      else 
        answer = answer + "\n  " + java.util.Arrays.toString(row); 
    }
    return answer + "\n]";
  }
}