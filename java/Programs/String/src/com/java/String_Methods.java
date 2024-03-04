package com.java;

public class String_Methods {
	
	public static void main(String[] args) {
		String s1 = "Janu";
		String s2 = "Janu"; //memory optimization
		String s3 = "     Janu";
		String s4 = "kala";
		String s5 = "Rohan";
		String s =  "praveen";
		s1 = s5;
		s4 = s1 = s2 = s5;
		s5 = s4;
		System.out.println(s2);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s3.replace('J','K'));
		System.out.println(s3.concat(s1));
		System.out.println(s5.replace(s1, s3));
		System.out.println(s.split(s));
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf('a', 7));
		System.out.println(s1.indexOf(s5));
		System.out.println(s.valueOf(2));
	}

}
