package com.aop.advice;

import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice{
	public void afterThrowing(Exception ex){  
        System.out.println("additional concern if exception occurs");  
    }  
}
