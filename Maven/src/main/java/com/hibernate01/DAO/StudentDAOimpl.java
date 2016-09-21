package com.hibernate01.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate01.model.Student;



public class StudentDAOimpl implements StudentDAO
{
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory= sessionFactory;
	}
	public void save(Student s)
	{
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.persist(s);
		trans.commit();
		session.close();		
	}

	public List<Student> list()
	{
		Session session = this.sessionFactory.openSession();		
		@SuppressWarnings({ "deprecation", "unchecked" })
		List<Student> studentList = session.createQuery("from student").list();
		session.close();
		return studentList;
	}

}
