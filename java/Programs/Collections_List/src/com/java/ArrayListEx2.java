package com.java;

import java.util.*;

public class ArrayListEx2 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(40);
		al.add(20);
		al.add(30);
		al.add(10);
		System.out.println(al);
		for (int num : al) {
			System.out.println(num);
		}
		al.remove(0);
		for (int num : al) {
			System.out.println(num);
		}
	}

}
