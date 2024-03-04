package Com.java;

import java.util.*;

class Employee{
	int id ;
	String Name;
	String Address;
	Employee(int id, String Name, String Address){
		this.id = id;
		this.Name = Name;
		this.Address = Address;
	}
}

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap <Integer,Employee> sh = new HashMap<>();
		sh.put(101,new Employee(101,"Sura","PLM"));
		sh.put(102,new Employee(100,"HAra","PGU"));
		/*Iterator<Integer> an = sh.keySet().iterator();
		while( an. hasNext()) {
			int key = an.next();
			System.out.println(key);
			Employee emp = sh.get(101);
			System.out.println(emp.Name);
		}*/
		
		for(int key : sh.keySet()) {
			Employee emp = sh.get(key);
			System.out.println(emp.id+emp.Name);
		}
	}


}
