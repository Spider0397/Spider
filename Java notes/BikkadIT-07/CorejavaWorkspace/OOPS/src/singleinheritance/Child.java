package singleinheritance;

public class Child extends Parent{

	public void m2() {
		System.out.println("m2 method of child class");
	}
	
	public static void main(String[] args) {
		
		Child c=new Child();
		c.m1();
		c.m2();
	}
}
