package com.kyc.emp;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FormerMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		boolean b = true;
		while(b==true) {
		Formers fm = new Formers();
		
		System.out.println("Enter Former Name");
		String name = sc.next();
		fm.setFname(name);
		System.out.println("Enter Your State");
		String state = sc.next();
		fm.setState(state);
		System.out.println("Enter Your city");
		String city = sc.next();
		fm.setCity(city);
		System.out.println("Enter Your Villege");
		String villege = sc.next();
		fm.setVillage(villege);
		System.out.println("Enter former yearly income");
		double income = sc.nextDouble();
		fm.setIncome(income);
//		System.out.println("Enter Former Resitation date");
//		Date date = sc.;
//		fm.setFname(name);
		

        Configuration cfg = new Configuration();
        cfg.configure("Employee.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(fm); // Save the EmployeeImp instance, not the transaction
        transaction.commit();
        session.close();
        System.out.println("Data inserted successfully");
	}
	}
}
