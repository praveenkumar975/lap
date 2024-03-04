package com.java;

interface portable{
	void print();
}
interface showable extends portable{
	void show();
}
class testable implements portable,showable{
	public void print() {
		System.out.println("hello");
	}

	@Override
	public void show() {
		System.out.println("bye");
		
	}
}

public class Test {

	public static void main(String[] args) {
		testable t = new testable();
		t.print();
		t.show();
	}

}
