package com.java;



public class Field {
	private String fieldName;
	void set(String Name) {
		fieldName = Name;
	}
	String getName(){
		return fieldName;
	}	
	public static void main(String[] args) {
		Field f = new Field();
		f.set("Software");
		System.out.println("Field :"+f.getName());
	}

}
