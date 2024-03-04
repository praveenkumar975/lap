package com.java;

public class Equal {

	public static void main(String[] args) {
		String str1 = new String("PK_m");
		String str2 = new String("PK");
		String str3 = new String("PK");
		String str4 = new String("PK");
		String s1 = "DK";
		String s2 = "DK";
		String s3 = "dk_m";
		s3 = str4;
		String s4 = str2.intern();
		System.out.println(s4);
		System.out.println(s1.equals(str4));
		System.out.println(s3==s2);
		System.out.println(str1.toLowerCase());
		System.out.println(str3.toUpperCase());
		


	}

}
