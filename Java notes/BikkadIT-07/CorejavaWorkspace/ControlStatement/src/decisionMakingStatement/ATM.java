package decisionMakingStatement;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		System.out.println("Welcome to SBI bank ATM Service");

		System.out.println("Press 1 for balance enquiry");
		System.out.println("Press 2 for Deposit");
		System.out.println("Press 3 for withdraw");
		System.out.println("Press 4 for mini statement");

		Scanner sc = new Scanner(System.in);

		int ch = sc.nextInt();
		switch (ch) {

		case 1: System.out.println("You balance is 1000 rs");
			break;
		case 2: System.out.println("Deposit successful");
			break;

		case 3:System.out.println("Withdraw successful");
			break;

		case 4:System.out.println("Your mini statement is sent to your mail id");
			break;
		default:
			System.out.println("Invlaid choice");
			break;

		}

	}
}
