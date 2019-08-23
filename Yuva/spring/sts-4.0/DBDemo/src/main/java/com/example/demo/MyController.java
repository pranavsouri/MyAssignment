package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping("/")
	public String display(){
		return "welcome.jsp";
	}
	
	@RequestMapping("/displayAll")
	@ResponseBody
	public String displayAll() {
		return dao.findAll().toString();
	}
	
	@RequestMapping("/displayEmp")
	@ResponseBody
	public Optional<Employee> displayEmp(@RequestParam int eid) {
		return dao.findById(eid);
	}
	
	@RequestMapping("/displayDesg")
	@ResponseBody
	public String displayDesg(@RequestParam String designation) {
		return dao.findByDesignation(designation).toString();
	}
	
	@RequestMapping("/displayByAge")
	@ResponseBody
	public String displayByAge() {
		return dao.getEmpsSortedByAge().toString();
	}
	
}
