package com.java;

public class Ifelseif {

	public static void main(String[] args) {
		int salary = 50000;
		if(salary>51000) {
			System.out.println("Above 50k");
		}
		else if (salary >20000 & 30000<salary) {
			System.out.println("Average");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
