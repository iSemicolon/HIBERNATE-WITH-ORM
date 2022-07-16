package org.kol.InsertApp;

/*Insert Record Into MY-SQL DataBase*/
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDao {

	public static void main(String[] args) {

		Students student1=new Students();
		student1.setName("PALASH");
		student1.setAddress("KOLKATA");
		
		Students student2=new Students();
		student2.setName("KALYAN");
		student2.setAddress("MAHISBATHAN");
		
		Students student3=new Students();
		student3.setName("TIYA");
		student3.setAddress("COOCHBEHAR");
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sef=cfg.buildSessionFactory();
		Session ses=sef.openSession();
		
		Transaction trns=ses.beginTransaction();
		
		ses.save(student1);
		ses.save(student2);
		ses.save(student3);
		
		trns.commit();
		ses.close();
		
	}

}
