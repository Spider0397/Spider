package typesOfOperator;

public class RelationalOperator {

	public static void main(String[] args) {

		System.out.println("> operator");

		int a = 20;
		int b = 10;
		System.out.println("> operator : " + (a > b));

		System.out.println("< operator");
		int c = 10;
		int d = 20;
		System.out.println("< operator :" + (c < d));

		System.out.println(">= operator");

		int x = 20;
		int y = 20;
		System.out.println(">= operator :" + (x >= y));

		System.out.println("<= operator");
		int p = 11;
		int q = 11;
		System.out.println("<= operator:" + (p <= q));

		System.out.println("== operator");
		int e = 88;
		int f = 88;
		System.out.println("== operator :" + (e == f));

		System.out.println(" != operator");
		int g = 56;
		int h = 56;

		System.out.println(" != operator :" + (g != h));
	}

}
