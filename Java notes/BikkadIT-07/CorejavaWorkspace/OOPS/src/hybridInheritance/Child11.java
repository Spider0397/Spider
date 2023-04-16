package hybridInheritance;

public class Child11 extends Parent {

	public void m4() {
		System.out.println("m4 method of Child11 classs");
	}
	
	public static void main(String[] args) {
		
		Child11 c11=new Child11();
		c11.m1();
		c11.m4();
	}
}
