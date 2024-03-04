package com.java;

class see{
	int x,y;
	void sim() {
		x = 2;
		y = 4;
	}
	
}
class sum extends see{
	void add() {
		System.out.println(x+y);
	}
}
class sub extends see{
	void mi() {
		System.out.println(x-y);
	}
}
public class Hierarchical_Inheritance {//one super and more then sub

	public static void main(String[] args) {
		sum m = new sum();
		sub s =  new sub();
		
		s.sim();
		
		m.sim();
		s.mi();
		m.add();
		
;	}

}
