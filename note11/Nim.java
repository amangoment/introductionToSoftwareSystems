import java.util.*; 

class Nim {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Hello, and welcome to the game of Nim!");
    System.out.print("What is your name: "); 
    String user = console.nextLine();     
    int height = (int)(Math.random() * 90 + 10);     
    PileOfMarbles pile = new PileOfMarbles(height);     
    System.out.println("Game starts with a pile of height: " + pile.report());    
    int number, currentHeight;
    
    while (true) {      
      System.out.println("*** Computer moves.");       
      System.out.println("Pile of marbles of height: " + pile.report());       
      currentHeight = pile.report();       
      if (currentHeight == 1) { 
        number = 1; 
      } else { 
        number = (int)(Math.random() * (currentHeight / 2)) + 1; 
      }       
      System.out.println("Computer chooses to remove: " + number + " marbles.");      
      pile.move(number, "Computer");       
      System.out.println("--------------------------"); 
      System.out.println("*** Now " + user + " has to move."); 
      System.out.println("Pile of marbles of height: " + pile.report());       
      System.out.print(user + ", please enter number of marbles you want to take: "); 
      number = Integer.parseInt(console.nextLine()); 
      pile.move(number, user); 
      System.out.println("--------------------------"); 
    }
  }
}