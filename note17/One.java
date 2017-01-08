import java.io.*;
import java.util.*;

public class One {
  public static void main(String[] args) throws Exception {
    Scanner a = new Scanner(new File(args[0]));
    Map<String, Integer> b = new HashMap<String, Integer>();
    while (a.hasNextLine()) {
      // System.out.println( a.nextLine() );
      b.put(a.nextLine(), 10);
    }
    System.out.println(b);

    FileOutputStream fout = new FileOutputStream("database");
    ObjectOutputStream oos = new ObjectOutputStream(fout);
    oos.writeObject(b);
  }
}