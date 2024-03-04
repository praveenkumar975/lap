package com.java;


class TableEx{
	void printTable(int n) {
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
class Mt extends Thread{
	TableEx t;
	Mt (TableEx t){
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}
class Mt4 extends Thread{
	TableEx t;
	Mt4  (TableEx t){
		this.t = t;
	}
	public void run() {
		t.printTable(100);
	}
}

public class BlockLevel {

	public static void main(String[] args) {
		TableEx obj = new TableEx();
		Mt t1 = new Mt(obj);
		Mt4 t2 = new Mt4(obj);
		t1.start();
		t2.start();
		
	}

}

