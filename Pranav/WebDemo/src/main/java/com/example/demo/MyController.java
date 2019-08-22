/**
 * 
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Abridge
 *
 */
@Controller
public class MyController {
	
	@RequestMapping("/abc")
	public String demo()
	{
		return "demo";
	}
	


}
