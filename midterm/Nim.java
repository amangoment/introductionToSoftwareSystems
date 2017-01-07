/*

The Game of Nim (see problem statement here)

••• P6.6 The game of Nim. This is a well-known game with a number of variants. The following
variant has an interesting winning strategy. Two players alternately take
marbles from a pile. In each move, a player chooses how many marbles to take. The
player must take at least one but at most half of the marbles. Then the other player
takes a turn. The player who takes the last marble loses.
Write a program in which the computer plays against a human opponent. Generate a
random integer between 10 and 100 to denote the initial size of the pile. Generate a
random integer between 0 and 1 to decide whether the computer or the human takes
the first turn. Generate a random integer between 0 and 1 to decide whether the
computer plays smart or stupid. In stupid mode the computer simply takes a random
legal value (between 1 and n / 2) from the pile whenever it has a turn. In smart mode
the computer takes off enough marbles to make the size of the pile a power of two
minus 1—that is, 3, 7, 15, 31, or 63. That is always a legal move, except when the size
of the pile is currently one less than a power of two. In that case, the computer makes
a random legal move.
You will note that the computer cannot be beaten in smart mode when it has the first
move, unless the pile size happens to be 15, 31, or 63. Of course, a human player who
has the first turn and knows the winning
strategy can win against the computer.
•• P6.7 The Drunkard’s Walk. A drunkard in a grid of streets randomly picks one of four
directions and stumbles to the next intersection, then again randomly picks one of four directions, and so on. You might think that on average the drunkard doesn’t
move very far because the choices cancel each other out, but that is not the case.
Represent locations as integer pairs (x, y). Implement the drunkard’s walk over 100
intersections, starting at (0, 0), and print the ending location.

try java Nim Larry Laura Leslie 23

*/

import java.util.*;

class Nim {
	int marbles, turn = -1;
	ArrayList<String> players;
	Scanner in = new Scanner(System.in);

	Nim(int marbles, ArrayList<String> players) {
		this.marbles = marbles;
		this.players = players;
		System.out.println(this.marbles + " marbles game for " + this.players);
	}

	void play() {
		while (this.marbles > 0) {
			this.turn = (this.turn + 1) % this.players.size();
			System.out.print(this.marbles + " marbles, " + this.players.get(this.turn) + "'s turn: ");
			int howMany = in.nextInt();
			this.move(howMany);
		}
		void move(int marbles) {
			if (marbles < 0 || marbles > this.marbles || marbles != 1 && 
				marbles > this.marbles / 2 || marbles == 1 && this.marbles == 1) {
				this.marbles = 0;
			System.out.println("Sorry, " + players.get(this.turn) + ", you lose.");
			} else
			this.marbles -= marbles;
		}
		public static void main(String[] args) {
			ArrayList<String> players = new ArrayList<String>();
			for (int i = 0; i < args.length - 1; i++)
				players.add(args[i]);
			(new Nim(Integer.parseInt(args[args.length - 1]), players)).play();
		}
	}
}