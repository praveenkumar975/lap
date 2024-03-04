package com.java;

class A {
	protected void msg() {
		System.out.println("hii");
	}
}

class B extends A {
	protected void msg1() {
		System.out.println("byee");
	}
}

public class Protecte_axe_modifierEx {
	public static void main(String[] args) {
		B a = new B();

		a.msg();
		a.msg1();
	}
}
