package methodcalling2;

import methodcalling1.Demo3;

public class Demo4 {

	public void div() {
		
		int a= 30;
		int b= 6;
		int c= a/b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		
		Demo4 d4= new Demo4();
		d4.div();
		
		Demo3 d3= new Demo3();
		d3.mul();
		
	}
}
