package com.java;

class num extends Thread{
	public void run() {
		for(int i = 1; i <= 10; i ++) {
			try {
				Thread.sleep(600);
				System.out.println(i);
		}catch(Exception e) {
			System.out.println("Invalid");
		}
	}
}
}
public class ThreadEx1 {

	public static void main(String[] args) {
		num n = new num();
		
		num n1 = new num();
		Thread t = new Thread(n);
		Thread t2 = new Thread(n);
		Thread t1 = new Thread(n1);
		t.start();
		try {
		t.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		t1.start();
		t2.start();

	}
}
