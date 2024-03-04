package com.java;

class Ab{
	static {
		System.out.println("its class");
	}
}
class Private_AccessmodifierEx extends Ab{
	private int a = 190; //with in the class  allowed in the private,default,protected
	private void msg() {
		System.out.println(a);
		System.out.println("Hello Private");
	}
		public static void main(String args[]) {
			Private_AccessmodifierEx p = new Private_AccessmodifierEx();
			p.msg();
			
			
		}
}
