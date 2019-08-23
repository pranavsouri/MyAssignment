package com.aop.advice;

import java.lang.reflect.Method;

public class AfterAdvice implements org.springframework.aop.AfterReturningAdvice {
	
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("method after advice ");
	}
}
