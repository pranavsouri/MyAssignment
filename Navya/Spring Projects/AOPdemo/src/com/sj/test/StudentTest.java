package com.sj.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sj.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XmlBeanFactory beanfactory = new XmlBeanFactory(new ClassPathResource("aop1.xml"));
		Student myBean = (Student ) beanfactory.getBean("StudentProxy");
		myBean.printName();
		System.out.println("**************");
		myBean.printCourse();
		System.out.println("**************");
		try {
			myBean.validate(18);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
}
