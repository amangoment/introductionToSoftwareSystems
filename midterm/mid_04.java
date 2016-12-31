//Defining a (static) Method (calculate the square root)

class Four {
	public staic void main(String[] args) {
		double n = Double.parseDouble(args[0]);
		System.out.println(Four.sqrt(n) + " squared is equal to " + n);
	}
	static double sqrt(double n) {
		double low = 0, high = n, guess = (high + low) / 2;
		while (high - low > 1E - 12) {
			if (guess * guess < n) low = guess;
			else if (guess * guess > n) high = guess;
			else break;
			guess = (high + low) / 2;
		}
		return guess;
	}
}