package com.java;

public class Assignment {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		
		System.out.println(x += 5);//10+5=15
		System.out.println(y -= 10);
		System.out.println(x *= 10);//15*10=150
		System.out.println(z /= 30);
		System.out.println(y %= x);
		
		System.out.println(y ^= 10);
		System.out.println(x |= 10);
		System.out.println(z &= 30);
		
		System.out.println(y <<= 0);
		System.out.println(x >>= 10);
		System.out.println(z >>>= 30);
	}

}
