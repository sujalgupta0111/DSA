package office;

class X {
	static {
		System.out.println("X: static block");
	}
	{
		System.out.println("X: instance block");
	}

	X() {
		System.out.println("X: constructor");
		display();
	}

	void display() {
		System.out.println("X: display()");
	}

	static void info() {
		System.out.println("X: static info()");
	}
}

class Y extends X {
	int val = 100;

	static {
		System.out.println("Y: static block");
	}
	{
		System.out.println("Y: instance block, val = " + val);
	}

	Y() {
		System.out.println("Y: constructor, val = " + val);
	}

	@Override
	void display() {
		System.out.println("Y: display(), val = " + val);
	}

	static void info() {
		System.out.println("Y: static info()");
	}
}

public class Que27 {
	public static void main(String[] args) {
		X obj = new Y();
		obj.info();
	}
}
