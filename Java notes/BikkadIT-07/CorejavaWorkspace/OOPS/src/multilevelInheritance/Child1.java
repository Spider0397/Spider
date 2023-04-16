package multilevelInheritance;

public class Child1 extends Parent{

	
	public void m2() {
		System.out.println("m2 method of child1 class");
	}
	
	public static void main(String[] args) {
		
		Child1 c1=new Child1();
		c1.m1();
		c1.m2();
		
	}
}
