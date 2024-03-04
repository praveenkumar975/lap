package com.java;

class student{
	int id;
	String name;
	student(int i,String n){
		id = i;
		name = n;
		System.out.println(i+" "+n);
	}
}
public class ParameterConstructorEx1 {

	public static void main(String[] args) {
		student s = new student(0,"Praveen");
		student s1 = new student(1,"Manju");

	}

}
