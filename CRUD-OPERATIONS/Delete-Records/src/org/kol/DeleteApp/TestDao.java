package org.kol.DeleteApp;

/*Delete Record[using get() or load()] Into MY-SQL DataBase*/
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDao {

	public static void main(String[] args) {
		Students student1=new Students();

		//	This Kind of Data present in DB
		/*student1.setName("PALASH");
		student1.setAddress("KOLKATA");

		Students student2=new Students();
		student2.setName("KALYAN");
		student2.setAddress("SALTLAKE");

		Students student3=new Students();
		student3.setName("TIYA");
		student3.setAddress("COOCHBEHAR");*/



		Configuration cfg=new Configuration();
		cfg.configure();

		SessionFactory sef=cfg.buildSessionFactory();
		Session ses=sef.openSession();

		Transaction trns=ses.beginTransaction();

		//Students student=(Students)ses.load(Students.class, 3);//[Update Using load()]
		Students student=(Students)ses.get(Students.class, 2); //[Update Using get()]
		

		ses.delete(student);

		trns.commit();
		ses.close();


	}

}
