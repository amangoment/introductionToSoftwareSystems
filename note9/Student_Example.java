class Student_Example {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Johnatan", 12));
		students.add(new Student("Ben", 12));
		students.add(new Student("John", 12));
		students.add(new Student("Jon", 12));
		students.add(new Student("Angie", 12));
		System.out.println(students);
		Collections.sort(students);
		System.out.println(students);
	}
}