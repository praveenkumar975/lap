package com.java;

public class StaticMethodEx {
	static void  display(){
		System.out.println("This a static method");
	}
	public static void main(String[] args) {
		System.out.println("This main Method");
		StaticMethodEx.display();
		

	}

}
