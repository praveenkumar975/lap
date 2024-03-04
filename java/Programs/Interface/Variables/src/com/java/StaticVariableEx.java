package com.java;

public class StaticVariableEx {
	static int a = 299;			//static variable
	static int b = 699;
	static int result = a + b;
	static {					//static block
		System.out.println("it static variable");
	}
	public static void main(String[] args) {
		System.out.println(result + 2);

	}

}
