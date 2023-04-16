package multiplication;

import java.util.Scanner;

public class Mul {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second Number");
		int b = sc.nextInt();
		
		int c=a*b;
		
		System.out.println("Multiplication :"+c);
		
	}
}
