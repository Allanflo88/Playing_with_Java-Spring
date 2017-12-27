package com.allan;

public class HelloWorld {
	private String msg;

	public void getMsg() {
		System.out.println("Your message : " + msg);
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void init() {
		System.out.println("Bean is going through init.");
	}

	public void destroy() {
		System.out.println("Bean will destroy now.");
	}

}
