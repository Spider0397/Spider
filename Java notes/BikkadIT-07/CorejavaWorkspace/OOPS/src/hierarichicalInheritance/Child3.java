package hierarichicalInheritance;

public class Child3 extends Parent{

	public void m4() {
		System.out.println("m4 method of Child3 class");
	}
	
	public static void main(String[] args) {
		
		Child3 c3=new Child3();
		c3.m4();
		c3.m1();
	}
}
