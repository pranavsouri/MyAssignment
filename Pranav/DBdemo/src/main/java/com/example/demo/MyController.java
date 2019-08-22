/**
 * 
 */
package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Abridge
 *
 */
@Controller
public class MyController {
	
	@Autowired
	DBDao db;
	
	@RequestMapping("/")
	public String welcome()
	{
		return "welcome.jsp";
	}
	
	@RequestMapping("/displayAll")
	@ResponseBody //this annotation specifies that return is not file but a respone content
	public String displayAll()
	{
		return db.findAll().toString();
	}
	
	@RequestMapping("/displayEmp")
	@ResponseBody //this annotation specifies that return is not file but a respone content
	public Optional<Employee> displayEmp(@RequestParam int eid)
	{
		return db.findById(eid);
	}
	
	@RequestMapping("/findByDesignation")
	@ResponseBody
	public List<Employee> findByDesignation(@RequestParam String designation)
	{
		return db.findByDesignation(designation);
		
	}
	
	@RequestMapping("/getEmpInSortedByAge")
	@ResponseBody //this annotation specifies that return is not file but a respone content
	public List<Employee> getEmpInSortedByAge(String designation)
	{
		return db.getEmpInSortedByAge(designation);
	}
	
	@RequestMapping("/insertEmp")
	@ResponseBody
	public String insertEmp(Employee emp)
	{
		db.save(emp);
		return "Successfully saved";
	}

}
