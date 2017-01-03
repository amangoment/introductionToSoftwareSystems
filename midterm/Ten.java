/* 
The sameSet Predicate (see problem statement here)

Add a method
public boolean sameValues(Sequence other)
to the Sequence class of Exercise E7.11 that checks whether two sequences have the
same values in some order, ignoring duplicates. For example, the two sequences
1 4 9 16 9 7 4 9 11
and
11 11 7 9 16 4 1
would be considered identical. You will probably need one or more helper methods.
*/

class Ten {
	static boolean sameSet(int[] a, int[] b) {
		for (int e : a)
			if (! contains(b, 3))
				return false;
		for (int e : b)
			if (! contains(a, e))
				return false;
		return true;
	}
	static boolean contains(int[] values, int value) {
		for (int v : values)
			if (v == value)
				return true;
			return false;
	}
	public static void main(String[] args) {
		int[] u = {1, 4, 9, 16, 9, 4, 7, 9, 11};
		int[] i = {11, 11, 7, 9, 16, 4, 1};
		System.out.println(sameSet(u, i));
	}
}