package com.dcs.Student;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	boolean b = true;
    	while(b == true) {
        EmployeeImp emp = new EmployeeImp();

        System.out.println("Enter Student name");
        String name = sc.next();
        emp.setName(name);

        System.out.println("Enter Department");
        String department = sc.next();
        emp.setDepartment(department);

        System.out.println("Enter Salary");
        double salary = sc.nextDouble();
        emp.setSalary(salary);

        // Creating Hibernate session

        Configuration cfg = new Configuration();
        cfg.configure("Employee.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(emp); // Save the EmployeeImp instance, not the transaction
        transaction.commit();
        session.close();
        System.out.println("Data inserted successfully");
    	}
    }
}
