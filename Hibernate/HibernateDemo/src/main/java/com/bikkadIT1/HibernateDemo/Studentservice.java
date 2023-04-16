package com.bikkadIT1.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Studentservice {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
	Session session= factory.openSession();
	Transaction tx= session.beginTransaction();
	Student S= new Student();
	S.setRoll(101);
	S.setName("Santosh");
	S.setMark(65);
	S.setSubject("Maths");
	//session.save(S);
	Student s=session.load(Student.class,101);
	System.out.println(S.getName());
	tx.commit();
	session.close();
	
	factory.close();
	}
}
