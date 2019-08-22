/**
 * 
 */
package com.example.service;

import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;

/**
 * @author Abridge
 *
 */
public class EmployeeService {
	
	public Employee createEmployee(@RequestParam String ename,@RequestParam String eid)
	{
		Employee e = new Employee();
		
		e.setEid(eid);
		e.setEname(ename);
		
		return e;
	}
	
	public void deleteEmployee(@RequestParam String eid)
	{
		System.out.println("Deleting employee " + eid);
	}
	

}
