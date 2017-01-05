/*
 A ManyString is one of:

   -- empty

   -- (cons String ManyString) 

 Please implement this type in Java.

 In your code don't use import at all. 

 http://silo.cs.indiana.edu:8346/c212/fall2016/1114.phps

 http://www.java2novice.com/images/linked_list.png

Three classes: 
*/

public class Program {
  public static void main(String[] args) {
    ManyString m = new ManyString(); 
    System.out.println( m ); 
    m.cons( "Pacers" ); 
    System.out.println( m ); 
    System.out.println( m.first() );     
    m.cons( "Cavaliers" );
    System.out.println( m ); 
    // System.out.println( m.rest() ); 
  }
}