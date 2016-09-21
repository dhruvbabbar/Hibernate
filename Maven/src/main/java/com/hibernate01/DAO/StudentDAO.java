package com.hibernate01.DAO;

import java.util.List;
import com.hibernate01.model.Student;

public interface StudentDAO
{
	public void save(Student s);
	public List<Student> list();	
}
