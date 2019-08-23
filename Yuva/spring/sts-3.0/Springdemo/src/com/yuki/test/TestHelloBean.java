package com.yuki.test;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.yuki.HelloBean;

@SuppressWarnings({ "deprecation", "unused" })
public class TestHelloBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource resource=new ClassPathResource("hello.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(resource);
		HelloBean hb = (HelloBean) factory.getBean("bean1");
		hb.sayHello();
	}

}
