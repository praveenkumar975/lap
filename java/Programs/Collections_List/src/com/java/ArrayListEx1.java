package com.java;

import java.util.*;

class Stu{
	int id;
	String name;
	String school;
	Stu(int id,String name,String school){
		this. id = id;
		this.name = name;
		this.school = school;
	}
}
public class ArrayListEx1 {
	public static void main(String[] args) {
		Stu s1 = new Stu(1,"Praveen","ZPHS");
		Stu s2 = new Stu(3,"Vishnu","NMHS");
		Stu s3 = new Stu(2,"Hareesh","ZPHS");
	ArrayList<Stu> li = new ArrayList<>();
	li.add(s1);
	li.add(s2);
	li.add(s3);
	Iterator<Stu> itr = li.iterator();
	while(itr.hasNext()) {
		Stu s = (Stu)itr.next();
		System.out.println(s.id+" "+s.name+" "+s.school);
	}
	
}
}
