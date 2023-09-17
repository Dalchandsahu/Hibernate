package com.dcs.bank.sbi.mysite;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class finddata {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
        cfg.configure("annotation.cfrg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.openSession();
        
        //get address
        
       Address ad = (Address)session.get(Address.class, 1);
       System.out.println(ad.getStreet()+" : "+ad.getCity());
        
        session.close();
        factory.close();
	}
}
