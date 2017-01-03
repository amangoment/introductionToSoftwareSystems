/*
GPA Converter (see problem statement here)

Write a program that translates a letter grade into a number grade. Letter grades are
A, B, C, D, and F, possibly followed by + or –. Their numeric values are 4, 3, 2, 1, and
0. There is no F+ or F–. A + increases the numeric value by 0.3, a – decreases it by 0.3.
However, an A+ has value 4.0.

Enter a letter grade: B-
The numeric value is 2.7.

*/

class Nine {
	public static void main(String[] args) {
		String[] letters = {"F", "D-", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A"};
		double[] values = {0, 1-0.3, 1, 1+0.3, 2-0.3, 2, 2+0.3, 3-0.3, 3, 3+0.3, 4-0.3, 4};
		System.out.print("Enter value: ");
		double value = (new java.util.Scanner(System.in)).nextDouble();
		if (value > 4 || value < 0)
			System.out.println("Invalid input.");
		else
			for (int i = letters.length - 1; i > 0; i = i - 1) {
				if (value >= (values[i] + values[i - 1]) / 2) {
					System.out.println(letters[i]);
					System.exit(0);
				}
			}
			System.out.println("F");
	}
}