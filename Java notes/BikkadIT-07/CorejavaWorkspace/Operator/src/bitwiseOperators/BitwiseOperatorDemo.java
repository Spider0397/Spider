package bitwiseOperators;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {

		int a = -5;

		int b = 7;

		System.out.println("Bitwise AND:" + (a & b));
		System.out.println("Bitwise OR :" + (a | b));
		System.out.println("Bitwise EXOR:"+( a ^ b));
		System.out.println("Bitwise Complement :"+(~a));

	}
}
