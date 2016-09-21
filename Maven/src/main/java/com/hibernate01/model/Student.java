package com.hibernate01.model;


public class Student
{
	private long id;
	private String name;
	private String degree;
	private String roll;
	private String phone;
 
	public Student()
	{
		this.id = 0;
		this.name = null;
		this.degree = null;
		this.roll = null;
		this.phone = null;
	}
	public Student(String Name,String Degree,String Roll,String Phone)
	{
		//this.id = ID;
		this.name = Name;
		this.degree = Degree;
		this.roll = Roll;
		this.phone = Phone;
	}
	public long getId()
	{
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}