package com.java;


class High{
	int x = 12;
}
class Low extends High {
	int y = 8;
	void add() {
		System.out.println(x+y);
	}
}
public class Single_Inheritance {//one super class and one base class
	
	public static void main(String[] args) {
		Low l = new Low();
		l.add();
	}

}
