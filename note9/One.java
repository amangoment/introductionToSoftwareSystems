import java.io.*;
import java.util.*; // why do we need this?

class One {
  public static void main(String[] args) throws Exception {
    Map<String, Integer> d = new HashMap<String, Integer>();
    System.out.println( d );
    for (int i = 0; i < args[0].length(); i++) {
      String letter = args[0].substring(i, i+1);
      if (d.containsKey( letter )) {
        d.put(letter, d.get(letter) + 1);
      } else {
        d.put(letter, 1);
      }
      System.out.println( d );
    }
  }
}