package org.kol.DeleteApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDao {
	
	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.setName("PALASH");
		student1.setAddress("KOLKATA");
		

		Student student2=new Student();
		student2.setName("KALYAN");
		student2.setAddress("BANGALURU");
		

		Student student3=new Student();
		student3.setName("TIYA");
		student3.setAddress("NCB");
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sef=cfg.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction trns=ses.beginTransaction();
		Student std=(Student) ses.load(Student.class, 3);
		
		
		ses.delete(std);
		trns.commit();
		ses.close();
		
		
	}

}
