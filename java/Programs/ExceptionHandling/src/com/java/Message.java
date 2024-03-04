package com.java;

class superclass{
	void method()throws ArithmeticException {
			int a = 10/0;
			System.out.println(a);
	}
}
class subclass extends superclass{
	void method(){
		System.out.println("this subclass");
	}
}
public class Message {

	public static void main(String[] args)  {
		System.out.println("this main method");
		subclass s = new subclass();
		s.method();
		superclass c = new superclass();
		c.method();
	}

}
