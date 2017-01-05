import java.io.*;
import java.util.*;

public class Two {
  public static void main(String[] args) throws FileNotFoundException,
                                                IOException,
                                                ClassNotFoundException {
    FileInputStream fis = new FileInputStream("database");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Map<String, Integer> a = (HashMap<String, Integer>) ois.readObject();

    // int i = ois.readInt();
    // String today = (String) ois.readObject();
    // Date date = (Date) ois.readObject();

    ois.close();

    System.out.println( a );

 }
}