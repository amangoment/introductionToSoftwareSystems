public class Triangle {
  int ax, ay, bx, by, cx, cy; 
  public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
    ax = x1; 
    ay = y1;
    bx = x2; 
    by = y2;
    cx = x3; 
    cy = y3;
  }
  public void angles() {
    double
      // http://mathsfirst.massey.ac.nz/Algebra/PythagorasTheorem/pythapp.htm
      a = Math.sqrt( Math.pow( bx - cx , 2) + Math.pow( by - cy , 2) ) , 
      b = Math.sqrt( Math.pow( ax - cx , 2) + Math.pow( ay - cy , 2) ) , 
      c = Math.sqrt( Math.pow( bx - ax , 2) + Math.pow( by - ay , 2) ) ; 
    System.out.println(a); 
    System.out.println(b); 
    System.out.println(c); 
    // https://www.mathsisfun.com/algebra/trig-cosine-law.html
    System.out.println( Math.toDegrees( Math.acos ( ( a * a + b * b - c * c ) / ( 2 * a * b) ) ) ); 
    System.out.println( Math.toDegrees( Math.acos ( ( a * a + c * c - b * b ) / ( 2 * a * c) ) ) ); 
    // System.out.println(...);
  }
  public static void main(String[] args) {
    Triangle a = new Triangle(0, 0, 3, 0, 0, 4);
    a.angles(); 
  }
}