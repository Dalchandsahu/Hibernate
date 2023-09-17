package com.Embeddal.exmaple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetrivaleStudentData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();

		Student st = session.get(Student.class, 5);

		System.out.println(st.getName() + " : " + st.getCity() + " : " + st.getCertificate());
	}
}
