package methodcalling;

public class Demo2 {

	public void sub() {
		
		int a=30;
		int b=15;
		int c= a-b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		
		Demo2 d2= new Demo2();
		d2.sub();
		Demo1 d1= new Demo1();
		d1.add();
		
	}
}

