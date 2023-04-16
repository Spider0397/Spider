package decisionMakingStatement;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your marks");
		int marks = sc.nextInt();
		if (marks > 100) {
			System.out.println("Invalid input");
		}	else if (marks >= 80) {
			System.out.println("You are Topper");
		} else if (marks < 80 && marks >= 60) {
			System.out.println("You are in First class");
		} else if (marks < 60 && marks >= 40) {
			System.out.println("You are in Second class");
		} else {
			System.out.println("You are not eligible for taking admission in next class");
		}

	}
}
