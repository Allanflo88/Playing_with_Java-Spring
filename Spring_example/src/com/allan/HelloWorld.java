package com.allan;

public class HelloWorld {
	private String msg1;
	private String msg2;

	public void getMsg1() {
		System.out.println("World message : " + msg1);
	}

	public void setMsg1(String msg) {
		this.msg1 = msg;
	}
	

	public void getMsg2() {
		System.out.println("world message : " + msg2);
	}

	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}

	public void init() {
		System.out.println("Bean is going through init.");
	}

	public void destroy() {
		System.out.println("Bean will destroy now.");
	}

}
