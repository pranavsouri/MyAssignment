package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(Demo1Application.class, args);
		
		Employee e1 = (Employee) context.getBean("emp");
		Employee e2 = (Employee) context.getBean("emp");
		
		//Employee e = SpringApplication.run(Demo1Application.class, args).getBean(Employee.class);
		//System.out.println(e);
		//e.setAge(20);
		//System.out.println(e.getAge());
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1.equals(e2));
		}

}
