/**
 * 
 */
package com.example.demo.model;

/**
 * @author Abridge
 *
 */
public class Employee {
	
	String eid;
	String ename;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
