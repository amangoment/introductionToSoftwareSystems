class Line {
  Point a, b;
  Line(Point a, Point b) {
    this.a = a; 
    this.b = b; 
  }  
  double length() {
    return this.a.distanceTo( this.b ); 
  } 
  public static void main(String[] args) {
    Line a = new Line(new Point(1, 1), Point.origin); 
    System.out.println(a.length()); // 1.4142... 
  }
}