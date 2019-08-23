package com.parent.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.parent.model.Car;

public class TestParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext factory=new ClassPathXmlApplicationContext("parent.xml");
        Car car =(Car) factory.getBean("anothercar");
       System.out.println(car.getColor());

	}

}
