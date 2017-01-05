import java.util.ArrayList; 

public class Two {
  public static void main(String[] args) {
    // int[][] m = new int[3][3];
    ArrayList<ArrayList<Integer>> m = new ArrayList<ArrayList<Integer>>();
    System.out.println( m );
    ArrayList<Integer> row = new ArrayList<Integer>(); 
    row.add(1);
    row.add(2); 
    m.add(row);
    System.out.println( m ); 
    row = new ArrayList<Integer>(); 
    row.add(3); 
    row.add(4);
    row.add(5);
    row.add(6);
    row.add(7);
    m.add(row); 
    System.out.println( m ); 
    row = new ArrayList<Integer>(); 
    row.add(8); 
    row.add(9);
    row.add(10);
    m.add(row); 
    System.out.println( m ); 
  }
}