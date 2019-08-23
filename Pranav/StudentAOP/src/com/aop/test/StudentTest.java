/**
 * 
 */
package com.aop.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.expression.BeanFactoryAccessor;
import org.springframework.core.io.ClassPathResource;

import com.aop.demo.Student;

/**
 * @author Abridge
 *
 */
public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XmlBeanFactory beanfactory = new XmlBeanFactory(new ClassPathResource("aop1.xml"));
		
		Student myBean = (Student) beanfactory.getBean("StudentProxy");
		
		myBean.printName();
		System.out.println("*************************");
		myBean.printCourse();
		System.out.println("*************************");
		

	}

}
