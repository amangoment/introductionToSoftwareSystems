import java.awt.*; 

public class Circle {
  int x, y, radius;
  Color c;

  public Circle(int x, int y, int radius, Color c) {
    this.x = x; 
    this.y = y;
    this.radius = radius;
    this.c = c;
  }

  public void draw(Graphics g) {
    g.setColor(this.c); 
    g.fillOval(this.x - this.radius, 
               this.y - this.radius, 
               2 * this.radius, 
               2 * this.radius);  
    g.setColor(Color.RED); 
    g.drawOval(this.x - this.radius, 
               this.y - this.radius, 
               2 * this.radius, 
               2 * this.radius);  
  }
  
  public void move(int dx, int dy) {
    this.x += dx; 
    this.y += dy; 
  }
}