class Student {
	int age = 20;
	double gpa;
	public static void main(String[] args) {
		Student s = new Student();
		Student q = new Student();
		q.age = 19;
		s.age = 21;
		q.age = 22;
	}
}