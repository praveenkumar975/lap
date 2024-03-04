package com.java;

class CollegeDetails extends StudentDetails {
	static String s = "VMHS";
	void none() {
		System.out.println(s);
	}

	public static void main(String[] args) {
		CollegeDetails c = new CollegeDetails();
		c.none();
		

	}

}
