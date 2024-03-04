package com.java;

class Bike extends Vehicle {
	void star() {
		System.out.println("bike started");
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		b.strat();

		Car c = new Car();
		c.strat();

		Vehicle v = new Car();
		v.strat();
		
	}

}
