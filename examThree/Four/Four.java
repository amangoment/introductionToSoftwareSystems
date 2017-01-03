import java.util.ArrayList; 
import java.util.Collections; 

public class Four {
  public static void main(String[] args) {
    ArrayList<Player> players = new ArrayList<Player>(); 
    players.add(new Player("Aiyun"  , 14));
    players.add(new Player("Xinya"  , 23));
    players.add(new Player("Xinhui" , 19));
    players.add(new Player("Xiaohui", 19));    
    System.out.println( players ); 
    Collections.sort( players ); 
    System.out.println( players ); 
  }
}