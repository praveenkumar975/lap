package com.java;

class Ar {
	private void Ar() {
		//class constructor private you can't create the instance
		System.out.println("Hello");
	}
	void msg() {
		System.out.println("Hello1");
	}
}
public class Private_AccessmodifierEx1 {

	public static void main(String[] args) {
		Ar a = new Ar();
		a.msg();
	
		}

}  //compile error
