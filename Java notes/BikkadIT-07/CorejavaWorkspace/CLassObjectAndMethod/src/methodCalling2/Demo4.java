package methodCalling2;

import methodcalling1.Demo3;

public class Demo4 {

	public void m4() {
		System.out.println("m4 Method ");

		Demo3 d3 = new Demo3();
		d3.m3();

	}

	public static void main(String[] args) {

		Demo4 d4 = new Demo4();
		d4.m4();
	}
}
