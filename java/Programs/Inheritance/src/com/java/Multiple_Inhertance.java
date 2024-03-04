package com.java;

interface Sound {
	void wave();
}

interface Frequency {
	void length();
}

class Volume implements Sound, Frequency {

	@Override
	public void length() {
		System.out.println("1273l");
	}

	@Override
	public void wave() {
		System.out.println("1256hz");
	}

}

public class Multiple_Inhertance {

	public static void main(String[] args) {
		Volume v = new Volume();
		v.length();
		v.wave();
	}

}
