package com.java;

public class DeadLock {

	public static void main(String[] args) {
		final String r1 = "Praveen";
		final String r2 = "Vishnu";
		Thread t1 = new Thread() {
			public void run() {
				synchronized(r1) {
					System.out.println("Thread 1: Locked r1");
					try {
						Thread.sleep(1000);
					}catch(Exception e){
						
					}
					synchronized(r2) {
						System.out.println("Thread 1: Locked r2");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized(r2) {
					System.out.println("Thread 2: Locked r2");
					try {
						Thread.sleep(1000);
					}catch(Exception e){
						
					}
					synchronized(r1) {
						System.out.println("Thread 2: Locked r1");
					}
				}
			}
		};
		t1.start();
		t2.start();
		/*try {
			t1.join();
			t2.join();
		}catch(Exception e){
			e.printStackTrace();
		}*/
	}

}
