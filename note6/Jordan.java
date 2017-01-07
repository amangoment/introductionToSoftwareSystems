public class Jordan {
  public static void main(String[] args) {
    String[][] entries = 
    {
      { "casa" , "thing", "house", "cat" },
      { "cosa" , "thing", "water", "cat"  , "house" },
      { "agua" , "cat"  , "dog"  , "water", "house", "thing"},
      { "hecho", "water", "fact" , "house", "thing" },
      { "pero" , "house", "dog"  , "fact" , "cat"   },
      { "gato" , "water", "dog"  , "fact" , "cat"   }
    };
    
    while (true) {
      int entry = (int) (Math.random() * entries.length); 
      // System.out.println( java.util.Arrays.toString( entries[entry] ) ); 
      System.out.println("What does " + entries[entry][0] + " mean? "); 
      for (int i = 1; i < entries[entry].length; i++)
        System.out.println("   * " + entries[entry][i]); 
      System.out.print("Type your answer (or bye to quit): "); 
      String line = (new java.util.Scanner(System.in)).nextLine(); 
      if (line.equals("bye")) break; 
    }
  }
}​