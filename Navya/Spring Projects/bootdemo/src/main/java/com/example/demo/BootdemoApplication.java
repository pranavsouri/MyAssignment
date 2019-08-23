package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootdemoApplication.class, args);
		//Employee e=context.getBean(Employee.class);
		Employee e1=(Employee) context.getBean("emp");
		
		System.out.println(e1);
		
	}

}
