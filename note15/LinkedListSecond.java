public class LinkedListSecond<T> {
  T car; 
  LinkedList<T> cdr; 
  LinkedList(T first, LinkedList<T> rest) {
    this.car = first; 
    this.cdr = rest; 
  }
  public T first() {
    return this.car; 
  }
  public LinkedList<T> rest() {
    return this.cdr;  
  }
  public LinkedList<T> cons(T e) {
     return new LinkedList<T>(e, this);  
  }
  public String toString() {
    return this.car + " " + this.cdr;  
  }
  public boolean contains(T e) {
    if (this.car.equals( e ))
      return true;
    else
      if (this.cdr == null) return false;
      else return this.cdr.contains( e );
  }
}