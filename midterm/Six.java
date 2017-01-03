/*
Growing and Sorting an ArrayList (see basic statement here)

Write a program that reads a set of floating-point values. Ask the user to enter the
values (prompting only a single time for the values), then print
• the average of the values.
• the smallest of the values.
• the largest of the values.
• the range, that is the difference between the smallest and largest.
*/

import java.util.*;

class Six {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.print("Enter: ");
		String line = s.nextLine();
		while (! line.equals("bye")) {
			numbers.add(Integer.parseInt(line));
			System.out.println(numbers);
			System.out.print("Enter: ");
			line = s.nextLine();
		}
		System.out.print("Here are the numbers sorted: ");
		Collections.sort(numbers);
		System.out.println(numbers);
	}
}