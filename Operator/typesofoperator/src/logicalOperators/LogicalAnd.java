package logicalOperators;

public class LogicalAnd {

	public static void main(String[] args) {
		
		int Y= 10;
		int Z= 20;
		
		System.out.println((Y<Z)&&(Y<Z));
		System.out.println((Y>Z)&&(Y<Z));
		System.out.println((Y<Z)&&(Y>Z));
		System.out.println((Y>Z)&&(Y>Z));
		
		
	}
}
