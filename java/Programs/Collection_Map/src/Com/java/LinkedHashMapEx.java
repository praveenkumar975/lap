package Com.java;

import java.util.*;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lHS = new LinkedHashMap<>();
		
		lHS.put(2,"Praveen");
		lHS.put(3,"Praveen");
		lHS.put(1,"Praveen");
		lHS.put(4,"Ravi");
		lHS.put(null,null);
		lHS.remove(2);
		System.out.println(lHS);
	}

}
