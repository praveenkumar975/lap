package com.java;

interface KmmHospital{
		
}
interface kmmHospital1 extends KmmHospital{
	void lead();
}
class Origin implements KmmHospital{
	int id = 13;
	String area = "MpL";
	String Phno = "+91723217350";
	void lead() {
		String director = "Niyna";
		System.out.println(director);
	}
	void display() {
		int id = 12;
		String area = "TPT";
		String Phno = "+91902345678";
		String director ="Hemma";
		System.out.println("Hospital: "+id+" "+area+" "+Phno);
		System.out.println(director);

	}
	
}
public class Hospitals {

	public static void main(String[] args) {
		Origin o = new Origin();
		System.out.println("Hospital: "+o.id+" "+o.area+" "+o.Phno);
		o.lead();
		o.display();
		
				
	}

}
