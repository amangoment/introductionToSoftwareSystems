import java.awt.*; 

public class Shape {
  int x, y, r; 
  Color color; 

  public Shape(int x, int y) {
    this.r = (int) (30 + (Math.random() * 60));
    this.x = x; 
    this.y = y;
    this.color = new Color( (float) (0.5 + Math.random() / 2), 
                            (float) (0.5 + Math.random() / 2), 
                            (float) (0.5 + Math.random() / 2) ); 
  }

  public void fall() {
    this.y += 5; 
  }

  public String toString() {
    return "(" + this.x + ", " + this.y + ")";  
  }

  public void draw(Graphics g) {
    g.setColor( this.color ); 
    g.fillOval( this.x - this.r, this.y - this.r, 2 * this.r, 2 * this.r ); 
    g.setColor( Color.BLACK ); 
    g.drawOval( this.x - this.r, this.y - this.r, 2 * this.r, 2 * this.r ); 
  }

  public void left() {
    this.x -= 5;
  } 

  public void right() {
    this.x += 5;
  } 

  public boolean touches(Ground g) {
    for (Shape shape : g) {
      if (shape.overlaps(this)) 
        return true;
    }
    return false; 
  }
  
  public boolean overlaps(Shape other) {
    int dx = this.x - other.x;
    int dy = this.y - other.y; 
    double d = Math.sqrt( dx * dx + dy * dy ); 
    return d <= this.r + other.r; 
  }
}
