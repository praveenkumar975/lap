package com.java;

public class TotalOfOddNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i <= 100;i++) {
			if(i%2 != 0) {
				sum ++;
				System.out.println("odd Number: "+ i);
				System.out.println("Sum of odd Number: "+ sum);
			}
		}
	}

}
