import java.util.Scanner;

public class Two {
  public static void main(String[] args) {
    int age; 
    String name;
    System.out.print("What's your name: "); 
    Scanner janis;
    janis = new Scanner( System.in ); 
    name = janis.nextLine(); // "Laura"; 
    System.out.print("How old are you: "); 
    age = janis.nextInt(); // 3;
    System.out.println( name + " you will be " + 
                        (age + 1) + " next year." );
  }
}

/*
> run Two
What's your name:  [DrJava Input Box]
How old are you:  [DrJava Input Box]
Tim you will be 6 next year.
*/