// A ManyString is one of:
//   -- empty
//   -- (cons String ManyString) 

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