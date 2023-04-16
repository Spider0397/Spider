package decisionMakingStatement;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your choice");
		System.out.println("Press 1 for case 1");
		System.out.println("press 2 for case 2");
		System.out.println("Press 3 for case 3");
		System.out.println("Press 4 for case 4");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("This is case 1");
			break;

		case 2:
			System.out.println("This is case 2");
			break;
		case 3:
			System.out.println("This is case 3");
			break;
		case 4:
			System.out.println("This is case 4");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}

	}

}
