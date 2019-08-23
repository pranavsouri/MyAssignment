/**
 * 
 */
package com.example.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Abridge
 *
 */
@Controller
public class MyController {
	
	@RequestMapping("/")
	public String login()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/greet")
	public ModelAndView greet(User user)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("Obj",user);
		mv.setViewName("welcome.jsp");
		return mv;
	}

}
