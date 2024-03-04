package com.java;

public class ConstructorEx {
		int i;
		String s;

 	ConstructorEx(int i,String s ){
		this.i = i;
		this.s = s;
		System.out.println(i + s);
	}
	public static void main(String[] args) {
		ConstructorEx n = new ConstructorEx(0, " Hello");
		
	}

}
