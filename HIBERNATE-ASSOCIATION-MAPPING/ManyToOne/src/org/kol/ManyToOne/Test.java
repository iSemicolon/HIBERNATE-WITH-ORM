package org.kol.ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Students s=new Students();
		s.setName("PALASH");
		
		
		Teachers t1=new Teachers();
		t1.setName("GAUTAM");
		t1.setStudents(s);
		
		
		Teachers t2=new Teachers();
		t2.setName("Shishira");
		t2.setStudents(s);
		
		Teachers t3= new Teachers();
		t3.setName("Shashi");
		t3.setStudents(s);
		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sef=cfg.buildSessionFactory();
		Session ses=sef.openSession();
		
		Transaction trns=ses.beginTransaction();
		ses.save(t1);
		ses.save(t2);
		ses.save(t3);
		
		
		trns.commit();
		ses.close();

		
	}

}
