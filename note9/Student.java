//discuss sorting an array (or arraylist) of objects)

import java.util.*;

class Student implements Comparable<Student> {
	String name;
	int age;
	public String toString() {
		return " (" + this.name + " " + this.age + ") ";
	}
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(Student other) {
		if (this.age < other.age)
			return -1;
		else if (this.age > other.age)
			return 1;
		else
			return this.name.compareTo(other.name);
	}
}