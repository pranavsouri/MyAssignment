package com.cycle.test;

//import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;

import com.cycle.model.BeanCycle;

public class TestBeanCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		AbstractApplicationContext factory=new ClassPathXmlApplicationContext("BeanCycle.xml");
		         BeanCycle cycle  =(BeanCycle) factory.getBean("cycle");
		         factory.registerShutdownHook();
		         
	}

}
