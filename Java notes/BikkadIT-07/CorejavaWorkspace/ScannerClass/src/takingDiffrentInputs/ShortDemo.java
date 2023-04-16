package takingDiffrentInputs;

import java.util.Scanner;

public class ShortDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter short value");

		int s = sc.nextShort();
		System.out.println("The value is:"+s);

	}
}