package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.BookDAO;
import com.example.demo.model.Book;

@RestController
@RequestMapping(value="/web")
public class MyController {
	
	@Autowired
	BookDAO dao;
	
	@GetMapping(value="hi")
	 public String sayHello() {
		 return "hello world";
	 }
	@GetMapping("/books")
	 public List<Book> findAll(){
		 return dao.findAll();
	 }
	
	@PostMapping("/books")
	public Book createBook(@RequestBody Book book) {
		return dao.save(book);
	}
}
