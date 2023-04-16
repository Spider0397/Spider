package object;

import methodcalling1.Demo3;

public class Student {

	int rollno;

	String name;

	String address;
	
	public static void main(String[] args) {
	
		Student stu1=new Student();
		stu1.rollno=1;
		stu1.name="Santosh";
		stu1.address="Pune";
		
		System.out.println(stu1.rollno +" "+ stu1.name +" "+ stu1.address +"\n" );
		
		Student stu2=new Student();
		stu2.rollno=2;
		stu2.name="Viaks";
		stu2.address="Nashik";
		System.out.println(stu2.rollno +" "+ stu2.name +" "+ stu2.address  );
		
		
		Demo3 d3=new Demo3();
		d3.m3();
		
	}
	
}
