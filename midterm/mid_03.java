//Basic Keyboard I/O (prompt the user, then read what (s)he types)

import java.util.*;

class Three {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String line = s.nextLine();
		double number = Double.parseDouble(line);
		System.out.println(Math.sqrt(number) + " squared is " + number);
	}
}