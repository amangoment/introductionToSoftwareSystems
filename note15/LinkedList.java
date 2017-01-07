public class LinkedList {
  Object car;
  LinkedList cdr;

  LinkedList(Object first, LinkedList rest) {
    this.car = first; 
    this.cdr = rest; 
  }

  public Object first() {
    return this.car; 
  }

  public LinkedList rest() {
    return this.cdr;  
  }

  public LinkedList cons(Object e) {
     return new LinkedList(e, this);  
  }

  public String toString() {
    return this.car + " " + this.cdr;  
  }
  
  public boolean contains(Object e) {
    if (this.car.equals( e ))
      return true;
    else
      if (this.cdr == null) return false;
      else return this.cdr.contains( e );
  }
}