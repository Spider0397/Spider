package methodCombination;

import java.util.Scanner;

public class Addition {

	public int  add() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b=sc.nextInt();
		
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {

		
		
		Addition at = new Addition();
		int result=at.add();
		System.out.println(result);
		

	}
}
