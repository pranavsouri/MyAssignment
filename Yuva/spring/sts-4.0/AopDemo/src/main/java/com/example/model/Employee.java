package com.example.model;

public class Employee {
	String name;
	String empid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + "]";
	}
	
}
