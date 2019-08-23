package com.sj.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
public class MyMethodAround implements MethodInterceptor{


	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		Object obj;
		System.out.println("before");
		obj=mi.proceed();
		System.out.println("after");
		return null;
	}

	
	
}
