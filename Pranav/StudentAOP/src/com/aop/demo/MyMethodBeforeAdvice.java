/**
 * 
 */
package com.aop.demo;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author Abridge
 *
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("Method before advice");

	}

}
