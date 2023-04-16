package statiblockExample;

public class StaticDemo {

	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {

		StaticDemo sd = new StaticDemo();

		StaticDemo sd1 = new StaticDemo();

	}
}
