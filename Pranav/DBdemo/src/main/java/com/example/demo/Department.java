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
public class Department {
	
	@Id
	int deptid;
	String dname;
	String manager;
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + ", manager=" + manager + "]";
	}
	
	

}
