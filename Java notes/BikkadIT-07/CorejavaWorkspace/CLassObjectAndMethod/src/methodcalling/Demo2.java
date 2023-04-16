package methodcalling;

public class Demo2 {

	public void m2() {
		System.out.println("m2 method");
		Demo1 d1=new Demo1();
		d1.m1();
	}

	public static void main(String[] args) {

		Demo2 d2=new Demo2();
		d2.m2();
	}
}