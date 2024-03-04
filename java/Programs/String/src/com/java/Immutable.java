package com.java;


final class Immutable{
	final String stuId,stuname;
	public Immutable (String stuId,String stuname){
		this.stuId = stuId;
		this.stuname = stuname;
	}
	public String getstuId() {
		return stuId;
	}	
	public String showstuName() {
		return stuname;
	}
	public static void main(String[] args) {
		Immutable s =new Immutable("08","madhu");
		System.out.println(s.getstuId());
		System.out.println(s.showstuName());
		String n = s.showstuName();
		System.out.println(n.replace("madhu","Praveen"));
	}

}
