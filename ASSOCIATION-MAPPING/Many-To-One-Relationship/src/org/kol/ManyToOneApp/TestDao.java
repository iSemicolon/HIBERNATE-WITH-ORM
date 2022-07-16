package org.kol.ManyToOneApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDao {

	public static void main(String[] args) {

		Students student1=new Students();
		student1.setStudentName("PALASH");
		
		Students student2=new Students();
		student2.setStudentName("KALYAN");
		
		
		Teachers teacher1=new Teachers();
		teacher1.setTeacherName("GAUTAM");
		teacher1.setStudents(student1);
		teacher1.setStudents(student2);
		
		
		Teachers teacher2=new Teachers();
		teacher2.setTeacherName("Shishira");
		teacher2.setStudents(student1);
		teacher2.setStudents(student2);
		
		Teachers teacher3= new Teachers();
		teacher3.setTeacherName("Shashi");
		teacher3.setStudents(student1);
		teacher3.setStudents(student2);
		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sef=cfg.buildSessionFactory();
		Session ses=sef.openSession();
		
		Transaction trns=ses.beginTransaction();
		ses.save(teacher1);
		ses.save(teacher2);
		ses.save(teacher3);
		
		
		trns.commit();
		ses.close();

	}

}
