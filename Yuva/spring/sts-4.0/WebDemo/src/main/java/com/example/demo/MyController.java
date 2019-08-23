package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/yoyo")
	public String demo() {
		
		return "index";}
	
	@RequestMapping("/yoyodemo")
	public String demodemo() {
		
		return "demo";
	}
	
}
