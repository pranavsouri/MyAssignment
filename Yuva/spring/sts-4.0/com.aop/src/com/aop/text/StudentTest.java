package com.aop.text;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.aop.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		XmlBeanFactory bf=new XmlBeanFactory(new ClassPathResource("aop1.xml"));
		Student mybean=(Student)bf.getBean("StudentProxy");
		mybean.printName();
		System.out.println("#####");
		mybean.printCourse();
		try{  
		    mybean.validate(12);  
		}catch(Exception e){e.printStackTrace();}
	}

}
