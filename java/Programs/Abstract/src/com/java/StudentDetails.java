package com.java;

abstract class StudentDetails {
	abstract void none();
	StudentDetails(){

		int id = 101;
		String name = "Vishnu";
		System.out.println("This Constructor");
		System.out.println(id+" "+name);
	}
}