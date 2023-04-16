package decisionMakingStatement;

public class NestedIf {

	public static void main(String[] args) {

		int a = 10;
		int b = 2;
		int c = 50;

		if (a > b) {

			if (a > c) {
				System.out.println(a);
			} else {

			}

		} else {

			if (b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}

	}
}
