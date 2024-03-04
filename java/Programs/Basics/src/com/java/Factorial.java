package com.java;

public class Factorial {

	public static void main(String[] args) {
		int n = 10;
		for(int i = 1;i <= n;i++) {
			System.out.println(fact(i));
		}
	}
	static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}

	}
}