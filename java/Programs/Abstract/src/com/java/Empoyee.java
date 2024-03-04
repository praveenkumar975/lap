package com.java;


abstract class SuperEmp{
	int id = 1011;
	String name = "RAm";
	abstract void empdetails();

void empaddress() {
	System.out.println("job ROLE: Manager");
}
}
class Company extends SuperEmp{
	int Id = 107;
	String Name = "HCL";
	void empdetails() {
		String add = "MPL";
		System.out.println(add);
	}
}

public class Empoyee {

	public static void main(String[] args) {
		Company c = new Company();
		System.out.println(c.Id+ " "+ c.Name);
		System.out.println(c.id+ " "+ c.name);
		c.empdetails();
		c.empaddress();
		
		
		

	}

}
