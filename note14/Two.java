import java.util.*;

public class Two {
  public static void main(String[] args) {
    for (int j = 0; j < 200; j++) {
      ArrayList<String> topics = new ArrayList<String>();
      topics.add("Write simplest shortest program that reports mouse motion.");
      topics.add("Write simplest program that reports mouse events other than motion.");
      topics.add("Write simplest program that can keep and report time.");
      topics.add("Write the simplest shortest program that sorts objects using Comparable.");
      topics.add("Write the simplest shortest program that sorts objects via the Comparator interface.");
      topics.add("Write simplest program that shows why and how we use Exceptions.");
      topics.add("Write simplest/shortest program that processes and responds to keyboard events.");
      topics.add("Write simplest program that creates/shows on the screen a few circles of various colors.");
      topics.add("Write simplest program with a JButton, JTextField and JLabel.");
      int i = (int)(Math.random() * topics.size());
      System.out.println( "1. " + topics.get(i) );
      topics.remove(i);
      i = (int)(Math.random() * topics.size());
      System.out.println( "2. " + topics.get(i) );
      topics.remove(i);
      i = (int)(Math.random() * topics.size());
      System.out.println( "3. " + topics.get(i) );
      topics.remove(i);
      System.out.println();
    }
  }
}