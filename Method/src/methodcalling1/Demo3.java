package methodcalling1;

public class Demo3 {

	public void mul() {
		
		int a= 20;
		int b= 5;
		int c= a*b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		
		Demo3 d3= new Demo3();
		d3.mul();
			
	}
}
