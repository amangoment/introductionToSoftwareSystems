/*

Scramble the Word (see problem statement here)

Write array methods that carry out the following tasks for an array of integers by
completing the ArrayMethods class below. For each method, provide a test program.
public class ArrayMethods
{
private int[] values;
public ArrayMethods(int[] initialValues) { values = initialValues; }
public void swapFirstAndLast() { . . . }
public void shiftRight() { . . . }
. . .
}
a. Swap the first and last elements in the array.
b. Shift all elements to the right by one and move the last element into the first
position. For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16.
c. Replace all even elements with 0.
d. Replace each element except the first and last by the larger of its two neighbors.
e. Remove the middle element if the array length is odd, or the middle two
elements if the length is even.
f. Move all even elements to the front, otherwise preserving the order of the
elements.
g. Return the second-largest element in the array.
h. Return true if the array is currently sorted in increasing order.
i. Return true if the array contains two adjacent duplicate elements.
j. Return true if the array contains duplicate elements (which need not be adjacent).

Doubting, dreaming dreams no mortal ever dared to dream before;

*/

import java.util.*;

class Twelve {
	public static void main(String[] args) {
		ArrayList<String> sentence = new ArrayList<String>();
		for (String word : args) sentence.add(scramble(word));
		System.out.println(sentence);
	}

	public static int index(String word) {
		return (int) (Math.random() * (word.length() - 2)) + 1;
	}
	
	public static String scramble(String word) {
		if (word.length() >= 4) {
			int i = index(word), j = index(word);
			while (j == 1) {
				j = index(word);
			}
			if (i > j) {
				int a = i; i = j; j = a;
			}
			System.out.println(word + " " + i + ", " + j + " ");
			return word.substring(0, i) + 
					word.substring(j, j+1) + 
					word.substring(i+1, j) +
					word.substring(i, i+1) +
					word.substring(j+1);
		}
		else return word;
	}
}