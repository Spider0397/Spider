package polymorphism;

public class MethodOverloadingDemo {

	public final  void add(int a, int b) {
		
		int c = a + b;
		System.out.println(c);
	}

	
public  final void add(int a, int b,int c) {
		
		int d = a + b +c;
		System.out.println(d);
	}

	public static void main(String[] args) {

		MethodOverloadingDemo mld=new MethodOverloadingDemo();
		mld.add(23, 40);
		mld.add(23, 40,80);
	}

}
