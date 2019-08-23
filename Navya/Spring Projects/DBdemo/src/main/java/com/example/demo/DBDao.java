package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DBDao extends JpaRepository<Employee, Integer>{
	
	public List<Employee> findByDesignation(String designation);
	@Query("from Employee where designation=?1 order by age")
	public List<Employee> getEmployeesInSorted(String designation);
}
