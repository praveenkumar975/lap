package com.java;

public class DefaultConstructorEx {
	int a;
	int b;
	String c;
	DefaultConstructorEx(){
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		System.out.println("c: "+c);
	}
	static void show() {
		String clg = "VMHS";
		System.out.println("Default: " + clg);
	}
	public static void main(String[] args) {
		DefaultConstructorEx d = new DefaultConstructorEx();
		DefaultConstructorEx d1 = new DefaultConstructorEx();
		d.show();
		d1.show();
	}
	
}
