package com.java;

public class Basic {

	public static void main(String[] args) {
		int [] number;
		number = new int[5];
		int [] number1 = {1,2,3,4,5};
		System.out.println(number1[0]);
		number1[0] = 30;
		for (int i = 0; i < number1.length;i++) {
			System.out.println(i+number1[i]);
		}
		
	}

}
