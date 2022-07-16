package org.kol.OneToOneApp;

/*ONE TO ONE MAPPNG*/
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

		Passport passport1=new Passport();
		passport1.setPassportName("PALASH");
		passport1.setPassportNumber("123");

		Passport passport2=new Passport();
		passport2.setPassportName("KALYAN");
		passport2.setPassportNumber("456");

		Passport passport3=new Passport();
		passport3.setPassportName("TIYA");
		passport3.setPassportNumber("789");

		Person person1=new Person();
		person1.setPersonName("PALAH SAMANTA");
		person1.setPassport(passport1);

		Person person2=new Person();
		person2.setPersonName("KALYAN JANA");
		person2.setPassport(passport2);

		Person person3=new Person();
		person3.setPersonName("TIYA MAITI");
		person3.setPassport(passport3);

		ses.save(person1);
		ses.save(person2);
		ses.save(person3);
		trns.commit();
		ses.close();
	}

}
