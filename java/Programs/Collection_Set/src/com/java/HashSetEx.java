package com.java;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		Set<Integer> hs1 = new HashSet<>();
		hs.add("Leo");
		hs.add("Mark");
		hs.add("newley");
		hs1.add(100);
		hs1.add(105);
		hs1.add(100);
		hs1.add(101);
		System.out.println(hs);
		System.out.println(hs1);
	}

}
