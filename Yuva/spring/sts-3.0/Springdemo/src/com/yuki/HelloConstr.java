package com.yuki;

public class HelloConstr {
	String msg;

	public HelloConstr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HelloConstr(String msg) {
		super();
		this.msg = msg;
	}
	public void sayHi() {
		System.out.println(msg+"Hi from spring team");
	}
}
