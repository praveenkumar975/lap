package com.java;

public class VariablesEx {
	int stuId = 1001;	//instance
	String stuName = "Manju";
	long phNo = 982480181;
	static {	//static
		String clgName = "VMHS";
	}
	void Show() { //method
		System.out.println("Details: "+stuId+" "+stuName+" "+phNo);
	}
	public static void main(String[] args) {
		float stuResults = 51.87f;	//local
		VariablesEx v = new VariablesEx();	//object creation
		v.Show();
		System.out.println(stuResults);

	}

}
