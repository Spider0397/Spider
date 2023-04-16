package variable;

public class LocalVariable {

	int a=40;
	
	public void show() {

	System.out.println(a);

	}

	public static void main(String[] args) {

		LocalVariable lc = new LocalVariable();
		lc.show();
	}
}
