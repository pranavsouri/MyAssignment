package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.model.Emp;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("employee.xml"));
		Emp emp=(Emp) factory.getBean("emp");
		emp.callDept();
	}

}
