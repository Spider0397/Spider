package staticInstanceAndConstructor;

public class Demo {

	static {
		System.out.println("Static block 2 ");
	}

	{
		System.out.println("Instance Block 2");
	}

	public Demo() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {

		Demo d = new Demo();

		Demo d1 = new Demo();
	}

	{
		System.out.println("Instance block 1");
	}

	static {
		System.out.println("Static block1 ");
	}

}
