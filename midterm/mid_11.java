/*

 Alternating Sum (see problem statement here)

•• E7.5 Compute the alternating sum of all elements in an array. For example, if your program
reads the input
1 4 9 16 9 7 4 9 11
then it computes
1 – 4 + 9 – 16 + 9 – 7 + 4 – 9 + 11 = –2
• E7.6 Write a method that reverses the sequence of elements in an array. For example, if
you call the method with the array
1 4 9 16 9 7 4 9 11
then the array is changed to
11 9 4 7 9 16 9 4 1

 */

class Eleven {
	public static void main(String[] args) {
		int[] a = {1, 4, 9, 16, 9, 7, 4, 9, 11};
		System.out.println(Eleven.alternatingSum(a));
	}
	static int alternatingSum(int[] a) {
		String result = a[0] + "";
		int sum = a[0];
		for (int i = 1; i < a.length; i = i + 1) {
			String sign = (i % 2 == 0) ? "+" : "-";
			result += " " + sign + " " + a[i];
			sum = sum + ((i % 2 == 0) ? a[i] : -a[i]);
		}
		System.out.print(result + " = ");
		return sum;
	}
}