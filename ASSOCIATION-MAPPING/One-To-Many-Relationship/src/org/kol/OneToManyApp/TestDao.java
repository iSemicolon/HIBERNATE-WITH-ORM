package org.kol.OneToManyApp;

/*ONE TO MANY MAPPNG*/
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDao {

	public static void main(String[] args) {
		Courses course1=new Courses();
		course1.setCourseName("JAVA");
		course1.setTeacherName("SHISHIRA");
		
		Courses course2=new Courses();
		course2.setCourseName("J2EE");
		course2.setTeacherName("GOUTHAM");
		
		List<Courses> courses=new ArrayList<Courses>();
		courses.add(course1);
		courses.add(course2);
		
		
		Students student=new Students();
		student.setStudentname("PALASH");
		student.setCourses(courses);
		
		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sef=cfg.buildSessionFactory();
		Session ses=sef.openSession();
		
		Transaction trns=ses.beginTransaction();
		ses.save(student);
		
		
		trns.commit();
		ses.close();
		
	}

}
