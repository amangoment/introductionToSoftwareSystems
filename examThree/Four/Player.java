//Write the simplest shortest program that sorts objects using Comparable.
// import java.lang.Comparable; 

public class Player implements Comparable<Player>{
  private String name;
  private int points;

  public Player(String name, int points) {
    this.name = name;  
    this.points = points; 
  }

  public String toString() {
    return // this.getClass().getName() + 
      this.name + ":" + this.points; 
  }
  
  public int compareTo(Player other) { // ascending 
    if (this.points > other.points) return 1;
    else if (this.points < other.points) return -1;
    else return this.name.compareTo(other.name); 
  }
}