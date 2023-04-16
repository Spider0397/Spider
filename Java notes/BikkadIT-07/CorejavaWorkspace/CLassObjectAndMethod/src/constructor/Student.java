package constructor;

public class Student {

	int rollno;
	String name;

	Student() {

	}

	Student(Student s) {
		this.rollno = s.rollno;
		this.name = s.name;
	}

	public static void main(String[] args) {

		Student stu = new Student();
		stu.rollno = 111;
		stu.name = "Santosh";
		System.out.println(stu.rollno);
		System.out.println(stu.name);

		Student stu1 = new Student(stu);
		System.out.println(stu1.rollno);
		System.out.println(stu1.name);

		Student stu2 = new Student(stu);
		System.out.println(stu2.rollno);
		System.out.println(stu2.name);
	}
}
