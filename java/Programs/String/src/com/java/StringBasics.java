package com.java;

public class StringBasics {

	public static void main(String[] args) {
		String s = "   _* Praveen Kumar M 123 ";
		String s1 = "Hello";
		String s2 = "";
		int a = s.length();
		String b = s.trim();
		String c = s.toUpperCase();
		String d = s.toLowerCase();
		String d1 = s1.intern();
		//String x = String[] split(s);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(d1);
		System.out.println(s1.concat(s));
		System.out.println(s1.equals(s));
		System.out.println(s2.isEmpty());
		System.out.println(s1.replace("H","Who"));
		System.out.println();
	}


}
