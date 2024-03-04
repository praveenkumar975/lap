package com.java;

class vehical{
	int i ;
	String s;
	void show() {
		System.out.println(i +" "+ s);
	}
}
public class DefaultConstructorEx1 extends vehical {
	
	public static void main(String[] args) {
		vehical v = new vehical();	//superclass object creation
		DefaultConstructorEx1 d = new DefaultConstructorEx1();	//subclass object creation
		d.show();
		v.show(); //superclass return type
		

	}

}
