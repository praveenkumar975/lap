package com.java;

public class ParameterConstructorEx {
	int a,b;
	ParameterConstructorEx(int a,int b){
		this.a = a;
		this.b = b;
	}
	void display() {
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		ParameterConstructorEx p = new ParameterConstructorEx(1,2);
		p.display();

}
	
}
