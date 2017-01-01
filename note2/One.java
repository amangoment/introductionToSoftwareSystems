import java.util.Arrays;

public class One {
  public static void main(String[] args) {
    System.out.println("Howdy."); 
    System.out.println( Arrays.toString( args ) ); 
    
  }
}

/*
> run One
Howdy.
[]
> run One Paul Leslie Tom Jay
Howdy.
[Paul, Leslie, Tom, Jay]
*/