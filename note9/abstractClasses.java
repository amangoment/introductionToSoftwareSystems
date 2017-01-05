class Point {
	int x, y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

abstract class Shape {
	Point location;
	Shape(Point where) {
		this.location = where;
	}
	abstract double area();
}

class Circle extends Shape {
	int radius;
	Circle(Point center, int radius) {
		super(center);
		this.radius = radius;
	}
	double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}
}

class Rectangle extends Shape {
	int width, height;
	Rectangle(Point topLeftCorner, int wide, int tall) {
		super(topLeftCorner);
		this.width = wide;
		this.height = tall;
	}
	double area() {
		return this.width * this.height;
	}
}

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