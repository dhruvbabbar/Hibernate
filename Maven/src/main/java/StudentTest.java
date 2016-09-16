

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {

	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
       
        	Student new_student = new Student();
        	new_student.setName("Dhruv");
        	new_student.setRoll("349");
            new_student.setPhone("9999");
            new_student.setDegree("B.Tech");            
            session.save(new_student);
        
        // it should technically save 20 same objects in the database
        //but I am getting an error. 
        
        System.out.println("Object saved !!");
        tx.commit();
        session.close();
        factory.close();
	}

}
