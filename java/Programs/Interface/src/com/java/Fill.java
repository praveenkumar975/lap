package com.java;

//multiple inheritance
interface A { //super
	public final int at = 3;
	void hello();
}

interface B { //super
	public final int a = 3;
	void hihii();
}

class C implements A, B { //sub

	
	public void hello() {
		System.out.println(at);
	}
	public void hihii() {
		System.out.println(a);
	}
}

public class Fill {
	public static void main(String[] args) {
		C c = new C();
		c.hello();
		c.hihii();
	}
}
