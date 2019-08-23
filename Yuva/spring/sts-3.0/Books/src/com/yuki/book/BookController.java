package com.yuki.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	
	@RequestMapping("/h")
	 String homePage() {
		System.out.println("Home page");
		return "home";
	}
	
	@RequestMapping("/list")
	 String display() {
		System.out.println("Connecting DB");
		return "list";
	}
}
