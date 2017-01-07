public class Unicorn extends Horse {
  Unicorn(String name) {
    super(name);
    // now add the horn etc. ...
  }

  public void sing() {
    System.out.println("That's me in the unicorner...");  
  }
  
  public void talk() {
    super.talk(); 
    System.out.println("Bonjour.");  
  }
}