package com.java;

public class InstanceMethodEx {
	int a = 23;
	long l = 77;
	void instance() {
		System.out.println(a+l);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceMethodEx i = new InstanceMethodEx();
		i.instance();
	}

}
