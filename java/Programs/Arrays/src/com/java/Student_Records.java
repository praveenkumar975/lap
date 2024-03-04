package com.java;

public class Student_Records {

	public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
		String [] names = {"praveen","manju","vishnu","Ram"};
		int [] ages = {24,26,23,25};
		char [] grades = {'A','B','A'};	
		System.out.println("size of array:");
		System.out.println(names.length);
		System.out.println(ages.length);
		System.out.println(grades.length);
		int stu_details = 4;
		if (stu_details >= 1 && stu_details <= names.length)  {
			int index = stu_details -1;
		System.out.println("student details:");
		System.out.println("name:"+names[index]);
		System.out.println("age:"+ages[index]);
		System.out.println("grade:"+grades[index]);
		}
		}
	}

