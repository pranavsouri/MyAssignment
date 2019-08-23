package com.aop.demo;

public class Student {
	
	String name;
	String course;
	int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", rollno=" + rollno + "]";
	}
	
	public void printName()
	{
		System.out.println("Name" + name);
	}
	
	public void printCourse()
	{
		System.out.println("Course" + course);
	}
	public void printRollno()
	{
		System.out.println("Rollno" + rollno);
	}

}
