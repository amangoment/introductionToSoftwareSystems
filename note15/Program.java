/*
 1. choose data representation
 2. give some examples
 3. choose name, number and names of arguments, as well as types (contract, signature)
 4. purpose statement (semantic aspect that the syntax can't account for)
 5. give some examples of input and output 
 6. write the template 
 7. finish code
 8. run the check-expects 
 */
 
 public class Program {
  public static void main(String[] args) {
    LinkedList a = null; 
    System.out.println( a ); // [ ]     
    a = new LinkedList( "Pacers", a ); 
    System.out.println( a ); 
    a = a.cons( 23 ); 
    a = a.cons( "Cubs" ); 
    System.out.println( a ); // [ 23, "Pacers" ]
    System.out.println( a.first() ); // 23
    System.out.println( a.rest() ); // [ "Pacers" ]
    System.out.println( a.contains( "Pacers" ) ); // true 
    System.out.println( a.contains( "Cleveland" ) ); // false     
  } 
}