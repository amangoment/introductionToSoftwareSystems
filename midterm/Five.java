/*The Bank Account Problem (see problem statement here)

•• R1.13 Write an algorithm to settle the following question: A bank account starts out with
$10,000. Interest is compounded monthly at 6 percent per year (0.5 percent per
month). Every month, $500 is withdrawn to meet college expenses. After how many
years is the account depleted?
••• R1.14 Consider the question in Exercise R1.13. Suppose the numbers ($10,000, 6 percent,
$500) were user selectable. Are there values for which the algorithm you developed
would not terminate? If so, change the algorithm to make sure it always terminates.

10000 6 500 says: Account lasts 1 years 9 months
*/

class Five {
	static double stipend, interest;
	public static void main(String[] args) {
		double balance = Double.parseDouble(args[0]);
		interest = Double.parseDouble(args[1])/100/12;
		stipend = Double.parseDouble(args[2]);
		if (balance * interest >= stipend)
			System.out.println("Account never gets depleted.");
		else
			System.out.println("Account lasts " + findOut(balance, 0));
	}
	
	static String findOut(double balance, int months) {
		double newBalance = balance * (1 + interest) - stipend;
		if (newBalance >= 0)
			return findOut (newBalance, months + 1);
		else
			return (months / 12) + " years " + (months % 2) + " months.";
	}
}