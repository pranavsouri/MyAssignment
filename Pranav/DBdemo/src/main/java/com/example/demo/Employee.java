/**
 * 
 */
package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Abridge
 *
 */

@Entity
public class Employee {
	
	@Id
	private int eid;
	private String ename;
	private int age;
	private String designation;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", age=" + age + ", designation=" + designation + "]";
	}
	
	

}
