/**
 * 
 */
package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Abridge
 *
 */
public interface DBDao extends JpaRepository<Employee,Integer>{
	
	public List<Employee> findByDesignation(String designation);
	
	@Query("from Employee where designation=?1 order by age") //this is JPQL not SQL
	public List<Employee> getEmpInSortedByAge(String designation);
	
	

}
