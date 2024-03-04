package com.java;

public class ExceptionEx {

	public static void main(String[] args) {
		int a[] = {10,20,30,40};
		try {
		int b = a[5];
		System.out.println(b);
	}
		catch(Exception e) {
		System.out.println("out of bond");
	}
		System.out.println("Program over");
	}
}
