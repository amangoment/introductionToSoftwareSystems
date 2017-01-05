public class ManyString {
  Cell head;
  // empty by default
  public void cons(String s) {
    this.head = new Cell(s, this.head);  
  }
  public String first() {
    return this.head.first; 
  }
  public String toString() {
    return "[" + this.head + "]"; // get rid of the comma and the null at the end too 
  }
}