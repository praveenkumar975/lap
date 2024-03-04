package com.java;

class super1{
	int a = 17;
}
class sub1_super1 extends super1 { //intermediate super and sub
	int b = 23;
}
class sub1 extends sub1_super1{
	int total = a + b;
	void add() {
		System.out.println(total);
	}
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		sub1 s = new sub1();
		s.add();
	}

}
