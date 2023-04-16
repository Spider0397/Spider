package multilevelInheritance;

public class Child2 extends Child1 {

	public void m3() {
		System.out.println("m3 method of Child2 class");
	}

	public static void main(String[] args) {

		Child2 c2=new Child2();
		c2.m1();
		c2.m2();
		c2.m3();
		
		
	}
}
