package method;

public class MethodDemo {

	public void add() {
		
		int a= 30;
		int b= 10;
		int c= a+b;
		System.out.println("addition of a and b="+c);
		
	}
	 
		public void sub() {
		
		
		int a= 40;
		int b= 20;
		int c= a-b;
		System.out.println("subtraction of a and b="+c);
		
	}
		
		public void div() {
			
		int a= 50;
		int b= 10;
		int c= a/b;
		System.out.println("division of a and b is="+c);
		
		}
		
		public void mul() {
			
		int a= 15;
		int b= 20;
		int c= a*b;
		System.out.println("multiplication of a and b is="+c);
		
		}
		public static void main(String[] args)
		{
					
		MethodDemo m= new MethodDemo();
		m.add();
		m.sub();
		m.div();
		m.mul();
		
		}
}
		