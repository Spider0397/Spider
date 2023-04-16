package staticAndInstanceBlock;

public class StaticBlockAndInstanceBlock {

	static {
		System.out.println("Static block1");
	}

	static {
		System.out.println("Static block2");
	}
	{
		System.out.println("Instance Block1");
	}

	{
		System.out.println("Instance Block2");
	}

	public static void main(String[] args) {

		StaticBlockAndInstanceBlock sb = new StaticBlockAndInstanceBlock();

		StaticBlockAndInstanceBlock sb1 = new StaticBlockAndInstanceBlock();

	}

}
