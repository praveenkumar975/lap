package com.java;

class black{
	void sub(String a, String b ) {
		System.out.println(a+" "+b);
	}
	void sub(long a, long d) {
		System.out.println(a+d);
	}
	void sub(byte a, byte c) {
		System.out.println(a+c);
	}
}
public class Colors extends black{

	public static void main(String[] args) {
		Colors c =new  Colors();
		c.sub(2, 127);
		c.sub(1234, 9870);
		c.sub(null, null);
	
	}

	

}
