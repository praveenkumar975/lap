package com.java;

import java.util.HashSet;


public class Duplicate_Values {

	public static void main(String[] args) {
		int a[] = {10,18,10,10,22,34,33,22,34};
		HashSet<Integer> e = new HashSet<>();
		for (int i = 0;i < a.length;i++) {
			if(!e.contains(a[i])){
			System.out.println(i+" "+a[i]);
			e.add(a[i]);
			}
		}
	}

}
