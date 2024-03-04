package com.java;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiEx {
	public static void main(String[] args) {
		// Create a list of strings
		List<String> names = Arrays.asList("Alice", "Bob", "Amy", "David", "Anna");

		// Filter names starting with letter "A" using Stream API
		List<String> char_A = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());

		// Print the filtered names
		System.out.println("Names starting with letter 'A': " + char_A);
	}
}
