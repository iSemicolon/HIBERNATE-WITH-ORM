package org.kol.OneToOneApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDao {

	public static void main(String[] args) {

		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sef=cfg.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction trns=ses.beginTransaction();
		
		Passport passport=new Passport();
		passport.setPassName("PALASH");
		
		Person person=new Person();
		person.setPerName("PALASH");
		person.setPassport(passport);
		
		ses.save(person);
		trns.commit();
		ses.close();
	}

}
