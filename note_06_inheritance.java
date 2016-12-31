class One {
	public static void main(String[] args) {
		Player team[] = new Player[5];
		team[0] = new Guard();
		team[1] = new Guard();
		team[2] = new Center();
		team[3] = new Forward();
		team[4] = new Forward();
		for (Player p : team)
			p.describe();
	}
}

class Player {
	void describe() {
		System.out.print("I am a player. ");
	}
}

class Guard extends Player {
	void describe() {
		super.describe();
		System.out.println("I play guard.");
	}
}

class Center extends Player {
	void describe() {
		super.describe();
		System.out.println("I play center.");
	}
}

class Forward extends Player {
	void descirbe() {
		super.descirbe();
		System.out.println("I play forward.");
	}
}