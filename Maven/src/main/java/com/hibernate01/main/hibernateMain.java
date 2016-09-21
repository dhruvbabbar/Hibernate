package com.hibernate01.main;



import com.hibernate01.DAO.StudentDAOimpl;
import com.hibernate01.model.Student;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hibernateMain 
{
	
	public static void main(String args[])
	{		
//		StudentDAOimpl impl= new StudentDAOimpl();
//		Student student1 = new Student ("Dhruv","B.Tech","20","22222222");
//		impl.save(student1);
		hibernateMain m = new hibernateMain();
		m.create("Dhruv","B.Tech","23","22222222");
		m.create("Babbar","B.Tech","22","2222");
		m.create("Rajeev","B.Tech","21","22222");
	}
	public void create(String Name,String Degree,String Roll,String Phone)
	{	
	Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");

    SessionFactory factory = cfg.buildSessionFactory();
    Session session = factory.openSession();
    //Transaction tx = session.beginTransaction();
//	Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Student student = new Student(Name,Degree,Roll,Phone);           
            session.save(student);
            transaction.commit();
            System.out.println("Records inserted sucessessfully");
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
	}
}
