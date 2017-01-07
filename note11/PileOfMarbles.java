class PileOfMarbles {  
  int height;

  PileOfMarbles (int height) {
    this.height = height; 
  }

  int report() {
    return this.height;
  }

  void move(int number, String user) {
    System.out.println("***Removing " + number + " marbles from the pile for: " + user); 
    if (number <= 0 || ((number > height / 2) && (number != 1))) {
      System.out.println("***Bad move for " + user + ". " + user + " loses.");
      System.exit(0);
    } else {
      this.height -= number;
      if (this.height == 0) {
        System.out.println("***End of game. " + user + " loses.");
        System.exit(0);
      }
    }
    System.out.println("Pile of marbles is now: " + this.report());
  }
}