package variable;

public class InstanceVariable {

	static int s = 40;
    int i=90;

	public static void main(String[] args) {

		InstanceVariable iv=new InstanceVariable();
		System.out.println(iv.i);
		
		System.out.println(InstanceVariable.s);
		
		

	}
}
