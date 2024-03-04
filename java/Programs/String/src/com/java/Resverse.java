package com.java;

public class Resverse {

	public static void main(String[] args) {
		String name = "Praveen";
		System.out.print("Resversed Name: ");
		for(int i = name.length()-1; i >= 0; i--) {
			System.out.println(name.charAt(i));
			System.out.println(name.length());
			System.out.println(name.format("hello", 737676823));
			System.out.println(name.substring(6));
			System.out.println(name.substring(2,5));
		}

	}

}
