package com.java;


class Stu extends Thread{
	public void run() {
		int a = 10;
		int b = 20;
		int total = a+b;
		System.out.println(total);
	}
}
public class Basic {

	public static void main(String[] args) {
		Stu s = new Stu();
		Thread t1 = new Thread(s);
		t1.start();
	}

}
