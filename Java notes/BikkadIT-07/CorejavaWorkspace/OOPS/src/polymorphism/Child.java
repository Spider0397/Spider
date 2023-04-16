package polymorphism;

public class Child extends Parent {

	public void m1() {
		System.out.println("m1 method of Child class");
	}

	public static void main(String[] args) {

		Parent p = new Parent();
		p.m1();

		Child c = new Child();
		c.m1();

		Parent p1 = new Child();
		p1.m1();
		
	//	Child c=new Parent();
		

	}
}
