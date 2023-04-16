package inheritance;

public class Child extends Parent {

	public void sub() {
		
		int a= 15;
		int b= 5;
		int c= a/b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		
		Child c=new Child();
		c.sub();
		c.add();
		c.mul();
		System.out.println(c.p);
		System.out.println(c.q);
		
	}
}
 