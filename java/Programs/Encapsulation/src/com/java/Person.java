package com.java;

public class Person {
	private String name, address;
	private int age;
	
	Person(String name, String address, int age){
		this.name = name;
		this.address  = address;
		this.age = age;
	}
	// setters
	void set(String name, String address) {
		this.name = name;
		this.address = address;
	}

	void set(int age) {
		this.age = age;
	}

	// getters
	String getName() {
		return name;
	}

	String getAddress() {
		return address;
	}

	int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Person p = new Person("Manju","MPL",26);
		System.out.println("Name : " + p.getName());
		System.out.println("Address: " + p.getAddress());
		System.out.println("Age  : " + p.getAge());
		
		p.set("Praveen", "2-250-20-6-B-18,MPL");
		p.set(25);
		System.out.println("Name : " + p.getName());
		System.out.println("Age  : " + p.getAge());
		System.out.println("Address: " + p.getAddress());

		p.set("Ram", "250-3490_3j,MPL");
		p.set(26);
		System.out.println("Name : " + p.getName());
		System.out.println("Age  : " + p.getAge());
		System.out.println("Address: " + p.getAddress());

	}

}
