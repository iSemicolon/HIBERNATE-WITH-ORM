package org.kol.ManyToManyApp;

/* MANY TO MANY MAPPNG */
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
		
		Courses courses1=new Courses();
		courses1.setCourse("JAVA");
		
		Courses courses2=new Courses();
		courses2.setCourse("DATA STRUCTURES");
		
		Courses courses3=new Courses();
		courses3.setCourse("SPRING");
		
		List<Courses> courses=new ArrayList<Courses>();
		courses.add(courses1);
		courses.add(courses2);
		courses.add(courses3);
		
		
		Students student1= new Students();
		student1.setStudentName("PALASH");
		student1.setCourses(courses);
		
		Students student2= new Students();
		student2.setStudentName("TIYA");
		student2.setCourses(courses);
		
		Students student3= new Students();
		student3.setStudentName("KALYAN");
		student3.setCourses(courses);
		
		
		Students student4= new Students();
		student4.setStudentName("NANDA");
		student4.setCourses(courses);
		
		List<Students> students=new ArrayList<Students>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		
		ses.save(student1);
		ses.save(student2);
		ses.save(student3);
		ses.save(student4);
		
		trns.commit();
		ses.close();
	}

}
