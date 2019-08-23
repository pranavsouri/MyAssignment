package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
	
	@Before(value="execution(* com.example.service.EmployeeService.*(..)) and args(name,empid)")
	public void beforeAdvice(JoinPoint joinpoint,String name, String empid) {
		System.out.println("Before method:"+ joinpoint.getSignature());
		System.out.println("Creating emp with name"+ name+" id:"+empid);
	}
}
