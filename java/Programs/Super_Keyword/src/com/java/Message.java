package com.java;

class parent{
	String msg = "hello parent";
	parent(){
		System.out.println("parent Constructor");
		}
	void display() {
		System.out.println(msg);
	}
}
class child extends parent{
	String msg = "hello child";
	child(){
		super();
		System.out.println("child Constructor");
	}
	void display() {
		super.display();
		System.out.println(msg);
	}
}

public class Message {
	
	public static void main(String[] args) {
		child c = new child();
		c.display();
	}

}
