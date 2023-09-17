package com.example.hibernateexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Embeddal.exmaple.Student;

public class App {
    public static void main(String[] args) {
        // Create a student object
        Student student = new Student();
        student.setName("John Doe");
        student.setCity("New York");

        // Create a Hibernate session and save the student
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();

        System.out.println("Student saved successfully!");
    }
}
