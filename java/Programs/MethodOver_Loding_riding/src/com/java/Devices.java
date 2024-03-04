package com.java;

class Mobiles {
	void sum() {
		int cost = 99999;
		String version = "Andriod 15";
		System.out.println(cost+" "+version);
	}
	void vivo() {
		int cost = 90199;
		String color = "porpul";
		String version = "Andriod 14";
		System.out.println(cost+" "+color+" "+version);
	}
	void realme() {
		int cost = 93499;
		String version = "Andriod 17";
		System.out.println(cost+" "+version);
	}
}
class Laptops extends Mobiles{
	static void dell() {
		int cost = 199999;
		String version = "windows 12";
		System.out.println(cost+" "+version);
	}
}

public class Devices extends Laptops{
	public static void main(String[] args) {
		Devices d = new Devices();
		d.sum();
		d.vivo();
		d.realme();
		Laptops.dell();
		
	}
}
