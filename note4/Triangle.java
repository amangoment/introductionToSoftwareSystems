class Triangle {
  Line a, b, c;

  Triangle(Point a, Point b, Point c) {
    this.a = new Line(b, c); 
    this.b = new Line(a, c); 
    this.c = new Line(b, a); 
  }

  double area() {
    double s = (this.a.length() + this.b.length() + this.c.length()) / 2;
    double a = this.a.length(), 
           b = this.b.length(),
           c = this.c.length(); 
    return Math.sqrt( s * (s - a) + (s - b) * (s - c) );  
  }
  
  public static void main(String[] args) {
    Triangle a = new Triangle( Point.origin, new Point(3, 0), new Point(0, 5) ); 
    System.out.println( a.area() ); // prints 6.0 
  }
}