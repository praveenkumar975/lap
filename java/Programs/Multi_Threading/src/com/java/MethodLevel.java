package com.java;


class Table{
	synchronized void printTable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(100);
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Mt1 extends Thread{
	Table t;
	Mt1 (Table t){
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}
class Mt2 extends Thread{
	Table t;
	Mt2 (Table t){
		this.t = t;
	}
	public void run() {
		t.printTable(100);
	}
}

public class MethodLevel {

	public static void main(String[] args) {
		Table obj = new Table();
		Mt1 t1 = new Mt1(obj);
		Mt2 t2 = new Mt2(obj);
		t1.start();
		t2.start();
		
	}

}
