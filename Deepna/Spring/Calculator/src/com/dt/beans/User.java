package com.dt.beans;

public class User {
	int num1,num2;
	Calculator c;
	public Calculator getC() {
	return c;
}

	public void setC(Calculator c) {
		this.c = c;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void addnum() {
	int sum=c.add(num1,num2);
	System.out.println(sum);
	}

}

