package Com.java;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(101,"Praveen");
		hm.put(102,"Ravi");
		hm.put(103,"Vishnu");
		hm.put(103,"Neela");//override
		System.out.println(hm);
		
	}

}
