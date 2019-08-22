/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;

/**
 * @author Abridge
 *
 */
@RestController
@RequestMapping(value="/web")
public class MyController {
	
	@Autowired
	BookRepo repo;
	
	@GetMapping("/books")
	public List<Book> findAll()
	{
		return repo.findAll();
	}
	
	@GetMapping(value="hi")
	public String sayHello()
	{
		return "Hello world";
	}
	
	

}
