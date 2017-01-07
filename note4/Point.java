import java.util.Scanner;

class Point {
  int x, y;

  static Point origin = new Point(); 
  Point(int x, int b) {
    this.x = x; 
    y = b; 
  }

  Point() {
    this(0, 0);
  }

  double distanceTo(Point other) {
    return Math.sqrt( Math.pow( this.x - other.x, 2 ) + Math.pow( this.y - other.y, 2 ) ); 
  }
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    System.out.print("Give me the x of the first point: "); 
    double x1 = s.nextInt(); //       
    Point a = new Point(x1, 3); 
    Point b = new Point(4, 0);
    System.out.println( a.distanceTo( b ) ); 
    System.out.println( (new Point(1, 1)).distanceTo( Point.origin ) ); // 1.4142
    System.out.println( Point.origin.distanceTo( new Point(3, 4) ) );
  } 
}