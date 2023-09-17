package com.kyc.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FormerDataRetrivel {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("Employee.cfg.xml").buildSessionFactory();
		
		Session s = factory.openSession();
		Formers fm = s.get(Formers.class, 4);
		System.out.println("Get method started");
		System.out.println(fm);
		
		Formers fm1 = s.load(Formers.class, 5);
		System.out.println("load method Started");
		System.out.println(fm1);
		
	}
}
