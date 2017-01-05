import java.awt.*; 

public class Bullet extends Circle {
  int vx = 3, vy = -3; 
  public Bullet(int x, int y, int r, Color c) {
    super(x, y, r, c); 
  }
  public void move() {
    this.x += this.vx; 
    this.y += this.vy;   
    if (this.x > 400) { this.x = 400; this.vx = - this.vx; } 
    if (this.x <   0) { this.x =   0; this.vx = - this.vx; } 
    if (this.y > 400) { this.y = 400; this.vy = - this.vy; } 
    if (this.y <   0) { this.y =   0; this.vy = - this.vy; } 
  }
}
