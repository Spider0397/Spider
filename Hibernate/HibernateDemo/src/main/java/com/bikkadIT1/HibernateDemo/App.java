package com.bikkadIT1.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    
    {
    Configuration cfg= new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory= cfg.buildSessionFactory();
    Session session= factory.openSession();
    Country ctr= new Country();
    ctr.setNo(101);
    ctr.setName("Pune");
    ctr.setPM("MODI");
    Transaction tx= session.beginTransaction();
    session.save(ctr);
    tx.commit();
    session.close();
    factory.close();
    
}


}