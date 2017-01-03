/*

Merge Procedure for Merge Sorting (see problem statement here)

• E7.22 Consider the following class:
public class Sequence
{
private ArrayList<Integer> values;
public Sequence() { values = new ArrayList<Integer>(); }
public void add(int n) { values.add(n); }
public String toString() { return values.toString(); }
}
Add a method
public Sequence append(Sequence other)
that creates a new sequence, appending this and the other sequence, without modifying
either sequence. For example, if a is
1 4 9 16
and b is the sequence
9 7 4 9 11
then the call a.append(b) returns the sequence
1 4 9 16 9 7 4 9 11
without modifying a or b.
•• E7.23 Add a method
public Sequence merge(Sequence other)
to the Sequence class of Exercise E7.21 that merges two sequences, alternating elements
from both sequences. If one sequence is shorter than the other, then alternate as long as you can and then append the remaining elements from the longer
sequence. For example, if a is
1 4 9 16
and b is
9 7 4 9 11
then a.merge(b) returns the sequence
1 9 4 7 9 4 16 9 11
without modifying a or b.

*/

// try java Fourteen 5 4 6 3 7 2 8 1 9 0

import java.util.*;

class Fourteen {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		for (String arg : args) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			row.add(Integer.parseInt(arg));
			a.add(row);
		}
		System.out.println(a);
		while (a.size() > 1) {
			for (int i = 0; i < a.size() - 1; i = i + 1) {
				a.add(i, merge(a.remove(i), a.remove(i)));
				System.out.println(a);
			}
		}
	}
	static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer result = new ArrayList<Integer>();
		while (a.size() > 0 || b.size() > 0) {
			if (a.size() == 0)
				result.add(b.remove(0));
			else if (b.size() == 0)
				result.add(a.remove(0));
			else if (a.get(0) > b.get(0))
				result.add(b.remove(0));
			else
				result.add(a.remove(0));
		}
		return result;
	}
}