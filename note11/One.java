import java.util.*; 

public class One {
  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<Integer>();  
    a.add(1); 
    a.add(4); 
    a.add(9); 
    a.add(16); 
    ArrayList<Integer> b = new ArrayList<Integer>();  
    b.add(9); 
    b.add(7); 
    b.add(4); 
    b.add(9); 
    b.add(11); 
    System.out.println( a ); 
    System.out.println( b ); 
    System.out.println( Jiahao.merge(a, b) ); 
  }

  public static ArrayList<Integer> merge(ArrayList<Integer> m, ArrayList<Integer> a) {
    ArrayList<Integer> result = new ArrayList<Integer>(); 
    int i = 0; 
    while (i < m.size() || i < a.size()) {
       if (i < m.size()) result.add(m.get(i));
       if (i < a.size()) result.add(a.get(i));
       i = i + 1; 
    }
    return result;     
  }
}