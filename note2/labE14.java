//Big Java(pp.25)

public class labE14 {
  public static void main(String[] args) {
    double balance = 1000; 
    double interest = 0.05; 
    System.out.println( "we begin with a balance of " + balance); 
    balance = balance + interest * balance; 
    System.out.println( "after 1 year the balance is " + balance); 
    balance = balance + interest * balance; 
    System.out.println( "after 2 year the balance is " + balance); 
    balance = balance + interest * balance; 
    System.out.println( "after 3 year the balance is " + balance); 
    balance = balance + interest * balance; 
    System.out.println( "after 4 year the balance is " + balance); 
    
  }
}

/*
Welcome to DrJava.  Working directory is C:\Users\dgerman\Desktop
> run E14
we begin with a balance of 1000.0
after 1 year the balance is 1050.0
after 2 year the balance is 1102.5
after 3 year the balance is 1157.625
after 4 year the balance is 1215.50625
> 
*/