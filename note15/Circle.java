import java.awt.*; 

public class Circle {
  int x, y, radius;
  Color c;

  public Circle(int x, int y, int r, Color c) {
    this.x = x; 
    this.y = y;
    this.radius = r;
    this.c = c;
  }

  public void draw(Graphics g) {
    g.setColor(this.c); 
    g.fillOval(this.x - this.radius, this.y - this.radius, 2 * this.radius, 2 * this.radius);  
  }
  
  public boolean overlaps(Circle other) {
    int dx = this.x - other.x;
    int dy = this.y - other.y; 
    double distance = Math.sqrt( dx * dx + dy * dy );  
    return this.radius + other.radius >= distance;
  }
}