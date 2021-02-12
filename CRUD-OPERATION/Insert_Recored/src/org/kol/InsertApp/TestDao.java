package org.kol.InsertApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDao {
	
	public static void main(String[] args) {
		
		Student student=new Student();
		student.setName("PALASH");
		student.setAddress("KOLKATA");
		
		Student student1=new Student();
		student1.setName("KALYAN");
		student1.setAddress("MAHISBATHAN");
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sef=cfg.buildSessionFactory();
		Session ses=sef.openSession();
		
		Transaction trns=ses.beginTransaction();
		
		ses.save(student);
		ses.save(student1);
		
		trns.commit();
		
		ses.close();
	}

}
