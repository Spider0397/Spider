package ternaryOperator;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		
		int min=(a<b) ? a : b;
		System.out.println("Less no is:"+min);
	}
}
