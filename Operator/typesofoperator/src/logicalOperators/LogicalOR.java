package logicalOperators;

public class LogicalOR {

	public static void main(String[] args) {
		
		int a= 25;
		int b= 40;
		
		System.out.println((a>b)||(a>b));
		System.out.println((a<b)||(a>b));
		System.out.println((a>b)||(a<b));
		System.out.println((a<b)||(a<b));
		
	}
}
