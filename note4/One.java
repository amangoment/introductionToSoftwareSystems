public class One {
  public static void main(String[] args) {
     int n = 6;
     System.out.println( n * (n + 1) / 2 ); 
     int sum = 0; 
     int i = 1;      
     System.out.println("I start with a sum of " + sum); 
     while (i <= n) {
       sum = sum + i; 
       System.out.println("Adding " + i + " sum becomes " + sum); 
       i = i + 1; 
    }
     System.out.println( sum ); 
  }
}