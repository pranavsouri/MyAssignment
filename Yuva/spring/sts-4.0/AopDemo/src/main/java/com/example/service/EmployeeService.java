package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Employee;
@Service
public class EmployeeService {
	public Employee createEmployee(@RequestParam String name,String empid) {
		Employee e= new Employee();
		e.setEmpid(empid);
		e.setName(name);
		return e;
	}
	public void deleteEmployee(@RequestParam String id) {
		System.out.println("Deleting employee:"+id);
	}
	
}
