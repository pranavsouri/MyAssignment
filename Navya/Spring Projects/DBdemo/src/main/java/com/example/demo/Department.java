package com.example.demo;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Department {

	@Id
	int deptid;
	String name1;
	String manager;
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", name=" + name1 + ", manager=" + manager + "]";
	}
	
}
