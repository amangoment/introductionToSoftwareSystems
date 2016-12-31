//Command-line Arguments (get some data from the command line)
//java Dave 6 returns Dave you will be 7 next year!

class Two {
	public static void main(String[] args) {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		System.out.println(name + "you will be " + (age + 1) + " next year!");
	}
}
