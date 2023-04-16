package ASMD;

public class ASMD {

	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition of two no="+c);
		
		}
	public void sub() {
		
		int x= 50;
		int y= 20;
		int z= x-y;
		System.out.println("subtraction of two no="+z);
	}
	
	public void mul() {
		
		int a= 6;
		int b= 5;
		int c=a*b;
		System.out.println("multiplication of two no="+c);
		
	}
	public void div() {
		
		int x= 50;
		int y= 10;
		int z= x/y;
		System.out.println("division of two no="+z);
		
	}
	public static void main(String[] args) {
		ASMD asmd= new ASMD();
		asmd.add();
		asmd.div();
		asmd.mul();
		asmd.sub();
		System.out.println("********");
		
		
		ASMD asmd1=new ASMD();
		asmd1.add();
		asmd1.mul();
		asmd1.div();
		asmd1.sub();
		System.out.println("ASMD");
		
		
	}
	
}

