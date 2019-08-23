package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@Autowired
	HttpSession session;
	@RequestMapping("/")
	public String login() {
		return "login.jsp";
	}
	@RequestMapping("/greet")
	public ModelAndView greet(User user){
//		String user=request.getParameter("uname");
//		String pwd=request.getParameter("upass");
//		System.out.println("Username: "+user);
//		System.out.println("Password: "+pwd);
//		or can use parameters in the function eg: greet(String uname,String upass) and setAttribute("userame",uname);
//		HttpSession session= request.getSession();
//		session.setAttribute("username",user);
//		session.setMaxInactiveInterval(5);
		
		String first=user.getUname();
		String second=user.getUpass();
		ModelAndView mv= new ModelAndView();
		
		if(first.equals(second)) {
			mv.addObject("obj",user);
			mv.addObject("msg","Successfully logged in!");
			mv.setViewName("welcome.jsp");
		}
		else
		{
			mv.setViewName("invalid.jsp");
		}
		return mv;
	}
}
