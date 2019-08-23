package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
	public List<Employee> findByDesignation(String designation);
	@Query("from Employee order by age DESC") //Java persistance query language
	public List<Employee> getEmpsSortedByAge();
}
