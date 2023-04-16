package method;

import java.util.Scanner;

public class ASMD {
	
	
	Scanner sc = new Scanner(System.in);

	public  void add() {

	
		System.out.println("enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("Addition :" + c);
	}

	public void sub() {
		
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		int c = a - b;
		System.out.println("Substraction :" + c);
	}

	public void mul() {

		
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		int c = a * b;
		System.out.println("Mul:" + c);
	}

	public void div() {

		
		System.out.println("Enter value of x ");
		int x = sc.nextInt();
		System.out.println("Enter value of y");

		int y = sc.nextInt();
		int z = x / y;
		System.out.println("div=" + z);

	}

	public static void main(String[] args) {
 
	ASMD asmd=new ASMD();
	asmd.add();
	asmd.sub();
	asmd.mul();
	
	
	
	
	
	}
}
