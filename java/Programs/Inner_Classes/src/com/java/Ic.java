package com.java;

class InnerClasses {
	private static int staticouter = 20;
	private int instanceouter = 10;

	static class StaticInnerClass {
		void display() {
			System.out.println("static inner class method accessing static outer variable" + staticouter);
		}
	}

	class InstanceInnerClass {
		void display() {
			System.out.println("instance inner class method accessing instance outer variable" + instanceouter);
		}
	}

	public void createlocalInnerClass() {
		int local = 30;
		class LocalInnerClass {
			void display() {
				System.out.println("local inner class method accessing local variable" + local);
			}
		}
		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
	}

	public void anonymousInnerClass() {
		Runnable runnable = new Runnable() {

	public void run() {
		System.out.println("anonymous inner class implementing runnale interface");
	}
	};
	new Thread(runnable).start();
	}
public class Ic{
	
	public static void main(String args[]) {
		InnerClasses.StaticInnerClass obj = new InnerClasses.StaticInnerClass();
		obj.display();

		InnerClasses outerobj = new InnerClasses();

		InnerClasses.InstanceInnerClass innerobj = new InnerClasses().new InstanceInnerClass();

		innerobj.display();
		outerobj.createlocalInnerClass();
		//outerobj.anonymousInnerClass();
	}
}
}
