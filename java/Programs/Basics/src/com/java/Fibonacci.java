package com.java;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a = 0, b= 1, c;
		System.out.println(a+" "+b);
		do {
			c = a+b;
			System.out.println(" "+c);
			a = b;
			b = c;
			c = a+b;
		}while(c<100);
	}

}
