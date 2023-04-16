package finalModifier;

public class Child  extends Parent{

	public void m1() {
		System.out.println("m method of Child class");
	}
	
	
	public static void main(String[] args) {
		
	Child c=new Child();
	c.m1();
		
	}
	
}
