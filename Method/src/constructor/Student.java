//Constructor: It is used to initialize object.
			//Constructor name is same as class name
			//Every jave class has constructor. 
			//In every constructor there is super keyword.
			//Constructor is called when we create object.
			//Constructor doesn't contain return type.


package constructor;

public class Student {

	int rollno;
	String name;
	
	public static void main(String[] args) {
		
		Student stu=new Student();
		System.out.println(stu.rollno);
		System.out.println(stu.name);
		
	}
}



