package com.java;

public class Unary {

	public static void main(String[] args) {
		int a = 8;
		int b = 8;
		int c = +10;
		int d = -10;
		boolean e = true;
		boolean f = false;
		int g = -20;
		
		
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		System.out.println(a++ + ++a);
		System.out.println(b-- + --b);
		
		System.out.println(~c);
		System.out.println(~d);
		System.out.println(!e);
		System.out.println(!f);
		System.out.println(~g);


		
	}

}
