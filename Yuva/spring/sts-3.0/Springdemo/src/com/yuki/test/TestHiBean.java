package com.yuki.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.yuki.HelloConstr;

public class TestHiBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("hello.xml"));
		HelloConstr bean= (HelloConstr) factory.getBean("bean2");
		bean.sayHi();

	}

}
