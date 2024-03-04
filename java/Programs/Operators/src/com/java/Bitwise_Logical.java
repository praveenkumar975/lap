package com.java;

public class Bitwise_Logical {

	public static void main(String[] args) {
		int a = 10;
		int b = 8;
		System.out.println(a & b);
		System.out.println(a ^ b);
		System.out.println(a | b);
		
		System.out.println((b>a) & (20>5)); //f - t = f
		System.out.println((20>10) & (b>a));//t - f = f
		System.out.println((20<10) & (b>a));//f- f = f
		System.out.println((20>10) & (a>b));//t - t = t

		System.out.println((b>a) ^ (20>5)); //f - t = t
		System.out.println((20>10) ^ (b>a));//t - f = t
		System.out.println((20<10) ^ (b>a));//f- f = f
		System.out.println((20>10) ^ (a>b));//t - t = f
		
		System.out.println((b>a) | (20>5)); //f - t = t
		System.out.println((20>10) | (b>a));//t - f = t
		System.out.println((20<10) | (b>a));//f- f = f
		System.out.println((20>10) | (a>b));//t - t = t
		
		System.out.println(a<b && b++<8); //f - t = f
		System.out.println(b);
		System.out.println(a<b & b++<8);//f- t = f
		System.out.println(b);
		
	
	}

}
