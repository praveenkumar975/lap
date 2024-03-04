package com.java;

public class PrimeNumberEx {

	public static void main(String[] args) {
		int total = 0;
		int sum = 0;
		for (int i = 2; i <= 100; i++) {
			boolean n = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					n = false;
					break;
				}
			}
			if (n) {
				total++;
				sum = sum + i;
				System.out.println(i);
				System.out.println("total of prime numbers: " + total);
				System.out.println("sum of prime numbers :"+sum);
			}

		}

	}
}
