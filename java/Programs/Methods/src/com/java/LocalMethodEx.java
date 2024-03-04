package com.java;

public class LocalMethodEx {
	void show() {
		int length = 4;
		int width = 5;
		int r = length * width;
		System.out.println(r);
	}
	public static void main(String[] args) {
		LocalMethodEx l = new LocalMethodEx();
		
		l.show();
		
	}

}
