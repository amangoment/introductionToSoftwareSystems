class Last {
	public static void main(String[] args) {
		Shape shapes[] = new Shape[3];
		shapes[0] = new Rectangle(new Point(4, 5), 12, 3);
		shapes[1] = new Circle(new Point(2, -3), 4);
		shapes[2] = new Circle(new Point(-8, 14), 2);
		for (int i = 0; i < shapes.length; i++)
			System.out.println((shapes[i].area());
	}
}