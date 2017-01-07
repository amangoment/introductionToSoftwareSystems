public class Cell {
  String first;
  Cell rest;

  public Cell(String s, Cell rest) {
    this.first = s; 
    this.rest = rest;
  }

  public String toString() {
    return this.first + ", " + this.rest; 
  }
}