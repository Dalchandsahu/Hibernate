package com.dcs.bank.sbi.mysite;

import java.io.FileInputStream;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("annotation.cfrg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        // creating object of address class
        
        Address add = new Address();
        add.setStreet("street1");
        add.setCity("raipur");
        add.setIsopen(true);
        add.setAdddate(new Date());
        add.setX(13255.978);
        
        // Reading image
        FileInputStream file = new FileInputStream("src/main/java/dal ppp.jpg");
        byte[] data = new byte[file.available()];
        file.read(data); 
        add.setImage(data);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(add);
        tx.commit();
        session.close();
        
        System.out.println("Data inserted successfully");
        
    }
}
