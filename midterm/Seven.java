/*
Standard Deviation (see problem statement here)

Mean and standard deviation. Write a program that reads a set of floating-point data
values. Choose an appropriate mechanism for prompting for the end of the data set.

sample use: java Seven 1 2 3 4 5 6 7 8 9 returns 2.7386127875258306
*/

class Seven {
	public static void main(String[] args) {
		double sum = 0, sumOfSquares = 0, count = 0;
		for (String arg : args) {
			double n = Double.parseDouble(arg);
			sum += n;
			sumOfSquares += n * n;
			count += 1;
		}
		System.out.print("Standard deviation is: ");
		System.out.println(Math.sqrt( (sumOfSquares - sum * sum / count) / (count - 1) ));
	}
}