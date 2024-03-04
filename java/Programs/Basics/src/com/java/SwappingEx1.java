package com.java;

public class SwappingEx1 {

	public static void main(String[] args) {
		char a = 'A',b = 'B';
		a ^= b;
		b ^= a;
		a ^= b;
		System.out.println("a value:"+a);
		System.out.println("b value:"+b);
	}

}
