package org.kol.ManyToManyApp;

import java.util.ArrayList;
import java.util.List;

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
		
		Course c1=new Course();
		c1.setCourse("JAVA");
		
		Course c2=new Course();
		c2.setCourse("DATA STRUCTURES");
		
		Course c3=new Course();
		c3.setCourse("SPRING");
		
		List<Course> courses=new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		
		Student s1= new Student();
		s1.setStudentName("PALASH");
		s1.setCourses(courses);
		
		Student s2= new Student();
		s2.setStudentName("TIYA");
		s2.setCourses(courses);
		
		Student s3= new Student();
		s3.setStudentName("KALYAN");
		s3.setCourses(courses);
		
		
		Student s4= new Student();
		s4.setStudentName("NANDA");
		s4.setCourses(courses);
		
		List<Student> students=new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		ses.save(s1);
		ses.save(s2);
		ses.save(s3);
		ses.save(s4);
		
		trns.commit();
		ses.close();
	}

}
