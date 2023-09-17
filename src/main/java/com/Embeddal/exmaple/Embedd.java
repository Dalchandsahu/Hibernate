package com.Embeddal.exmaple;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embedd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b == true) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();

			System.out.println("Enter Student Name");
			String name = sc.next();
			System.out.println("Enter Student City");
			String city = sc.next();
			System.out.println("Enter Course");
			String course = sc.next();
			System.out.println("Enter Course Duration");
			String duration = sc.next();
			Student std1 = new Student(name, city, new Certificate(course, duration));
//        Student std2 = new Student("dpsk", "delhi", new Certificate("html", "1 month"));

			Session s = factory.openSession();
			Transaction tx = s.beginTransaction();

			s.save(std1);

			tx.commit();
			s.close();
			factory.close();
			System.out.println("Data Insert Successfully");
		}
	}
}