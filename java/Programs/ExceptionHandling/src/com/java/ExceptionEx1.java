package com.java;

public class ExceptionEx1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			
			int result = a / b;
		System.out.println(result);

	}
		catch(Exception y) {
		System.out.println("empty");
	}
	}

}
