package pojos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernettest {

	public static void main(String[] args) {
		Student st1=new Student();
		st1.setRollno(15);
		st1.setName("kajal");
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(st1);
		session.getTransaction().commit();
		session.close();
	}

}
