import java.util.*;
import java.awt.*;

public class Cloud extends ArrayList<Circle> {
  
  public void draw(Graphics g) {
    for (Circle c : this)
      c.draw(g); 
  }
  
  public void collide(Bullet b) {
    for (int i = 0; i < this.size(); i++) { // better check from the other side
      if (this.get(i).overlaps(b)) {
        this.remove(i); 
        i--; 
      }
    }
  }
}