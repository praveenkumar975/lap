package com.java;

import java.util.EnumSet;

enum Days{
	MONDAY,TUESDAY,wednsday,THRUSDAY,FRIDAY,SATURDAY,SUNDAY,uuuDAy
}
public class EnumSetEx {

	public static void main(String[] args) {
		EnumSet<Days>ds = EnumSet.of(Days.MONDAY,Days.SUNDAY,Days.wednsday);
		System.out.println(ds);
	}

}
