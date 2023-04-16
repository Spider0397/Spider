package methodcalling;

public class Demo1 {

	public void add() {
		
		int a= 15;
		int b= 32;
		int c= a+b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		
		Demo1 d1= new Demo1();
		d1.add();
		
	}
}

