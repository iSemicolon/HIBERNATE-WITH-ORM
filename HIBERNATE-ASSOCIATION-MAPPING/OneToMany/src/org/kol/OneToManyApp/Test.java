package org.kol.OneToManyApp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Courses cs=new Courses();
		cs.setCourse("JAVA");
		cs.setTeacher("SHISHIRA");
		
		Courses cs1=new Courses();
		cs1.setCourse("J2EE");
		cs1.setTeacher("GOUTHAM");
		
		List<Courses> courses=new ArrayList<Courses>();
		courses.add(cs);
		courses.add(cs1);
		
		
		Student s=new Student();
		s.setName("PALASH");
		s.setCourses(courses);
		
		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sef=cfg.buildSessionFactory();
		Session ses=sef.openSession();
		
		Transaction trns=ses.beginTransaction();
		ses.save(s);
		
		
		trns.commit();
		ses.close();
		
	}

}
