package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyController {

	@Autowired
	DBDao dao;
	@Autowired
	DeptDBDao dao2;
	@RequestMapping("/")
	public String welcome() {
		return "welcome.jsp";
	}
	@RequestMapping("/displayAll")
	@ResponseBody
	public String displayAll() {
		
		return dao.findAll().toString();
	}
	@RequestMapping("/displayByDesignation")
	@ResponseBody
	public List<Employee> displayByDesignation(@RequestParam String designation) {
		
		return dao.findByDesignation(designation);
	}
	@RequestMapping("/displayByAge")
	@ResponseBody
	public List<Employee> displayByAge(String designation) {
		return dao.getEmployeesInSorted(designation);
	}
	@RequestMapping("/insertEmp")
	@ResponseBody
	public String insertEmployee(Employee emp) {
		dao.save(emp);
		return "Successfully inserted record";
	}
	@RequestMapping("/collect")
	public String demo(@RequestParam int eid, String manager) {
		Employee e=dao.findById(eid).orElse(new Employee());
		Department d=dao2.findByManager("Suresh");
		return ""+e.getName()+","+d.getManager();
	}
	
}
