/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CreditScore;
import com.example.demo.Repo.BankDao;

/**
 * @author Abridge
 *
 */

@RestController
@RequestMapping(value="/web")
public class BankController {
	
	@Autowired
	BankDao repo;
	
	@GetMapping("/creditscore")
	public List<CreditScore> findAll()
	{
		return repo.findAll();
	}
	
	@PostMapping("/data")
	public CreditScore save(@RequestBody CreditScore cs)
	{
		return repo.save(cs);
	}
	
	
	

}
