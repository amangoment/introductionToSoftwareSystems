interface Multiplier {
	int mul(int n, int m)
}

class Alpha implements Multiplier {
	public int mul(int n, int m) {
		renturn n * m;
	}
}

class Beta implements Multiplier {
	public int mul(int n, int m) {
		int result = 0;
		for (int i = 0; i < m; i++)
			result += n;
		return result;
	}
}

class Gamma implements Multiplier {
	public int mul(int n, int m) {
		if (m == 1) return n;
		else return n + mul(n, m-1);
	}
}

class Example {
	public static void main(String[] args) {
		Alpha a = new Alpha;
		Beta b = new Beta();
		Gamma g = new Gamma();
		int n = 5, m = 3;
		System.out.println(n + " * " + m + " = " + a.mul(n,m) + " (by Alpha)");
		System.out.println(n + " * " + m + " = " + b.mul(n,m) + " (by Beta)");
		System.out.println(n + " * " + m + " = " + g.mul(n,m) + " (by Gamma)");
	}
}