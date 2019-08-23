package com.sj.advice;

import org.springframework.aop.ThrowsAdvice;

public class MyMethodThrowsAdvice implements ThrowsAdvice {

	public void afterThrowing(Exception ex) {
		System.out.println("Throw method");
	}
}
