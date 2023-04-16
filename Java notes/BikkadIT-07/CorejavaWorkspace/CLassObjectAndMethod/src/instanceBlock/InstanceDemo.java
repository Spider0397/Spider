package instanceBlock;

import constructor.Student;

public class InstanceDemo {

	{
		System.out.println("Instance block");
	}

	public static void main(String[] args) {

		
		
		InstanceDemo id = new InstanceDemo();
		
		InstanceDemo id1=new InstanceDemo();
		
		Student stu=new Student();

	}
}
