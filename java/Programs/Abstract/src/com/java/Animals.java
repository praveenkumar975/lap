package com.java;

abstract class Dog {
	abstract int animalbehaviour();
}

class Cat extends Dog {
	int animalbehaviour() {
		System.out.println("good");
		return 0;
	}
}

class Monkey extends Dog {
	int animalbehaviour() {
		System.out.println("natural");
		return 9;
	}
}

public class Animals {

	public static void main(String[] args) {
		Monkey m = new Monkey();
		m.animalbehaviour();
		Cat c = new Cat();
		c.animalbehaviour();
	}
}
