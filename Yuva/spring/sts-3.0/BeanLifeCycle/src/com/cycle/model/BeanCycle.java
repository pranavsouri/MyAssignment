package com.cycle.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanCycle implements InitializingBean,DisposableBean{
	int counter;
	

	public BeanCycle() {
		super();
		counter=0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void destroy() throws Exception {
		counter++;
		System.out.println("destroy called"+counter);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		counter++;
		System.out.println("intialize called"+counter);

		// TODO Auto-generated method stub
		
	}
	 public void init() {
	      // do some initialization work
		 counter++;
			System.out.println("intialize called"+counter);

	   }
	 public void destroys() {
		 counter++;
			System.out.println("destroy called"+counter);
	      // do some destruction work
	   }

}
