package com.first.hiber.FisrtHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
    	try {
			
    		Configuration cfg = new Configuration();
        	cfg.configure("hibernatecfg.xml");
        	SessionFactory Factory = cfg.buildSessionFactory();    	
        	
            // Create a student object
            Student student = new Student();
            student.setName("dalchand");
            student.setCity("New Delhi");
            student.setId(989);
            System.out.println(student);

            // Create a Hibernate session and save the student
            
            Session session = Factory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
            session.close();

            System.out.println("Student saved successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
}
