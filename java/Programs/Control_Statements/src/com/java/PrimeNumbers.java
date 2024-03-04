package com.java;


public class PrimeNumbers {

	public static void main(String[] args) {
		for(int i = 0;i <= 100;i++) {
			if(isPrime(i)) {
				System.out.println(i+" ");
			}
		}
	}
//function to check if a number is prime
 static boolean isPrime(int n) {
	 //prime numbers are greater than 1
	 if(n<=1) {
	return false;//return false if the number is less than or equal to 1
 }
	 //loop through number from 2 to the square root of the number
	 for (int i = 2;i <=Math.sqrt(n);i++) {
		 if(n%i == 0) {
			 return false;//return false if the number is divisible
		 }
	 }
	 //if the number is not divisible by any number other than 1 and itself
	 //it's prime
	 return true;//return true if the number is prime
 }
}