package interfaceexamples;

public class TCS extends SBI {

	public void design() {
		
		System.out.println("Design done by TCS");
	}
	
	public void develope() {
		
		System.out.println("Development done by TCS");
		
	}
	
	public static void main(String[] args) {
		
		TCS tcs= new TCS();
		tcs.design();
		tcs.develope();
		
		SBI sbi= new TCS();
		sbi.design();
		sbi.develope();
		
	}
}
