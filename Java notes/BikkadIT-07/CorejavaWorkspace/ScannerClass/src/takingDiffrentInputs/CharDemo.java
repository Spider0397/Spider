package takingDiffrentInputs;

import java.util.Scanner;

public class CharDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any char");

		char c = sc.next().charAt(0);
		
		System.out.println("The char is:"+c);
	}
}
