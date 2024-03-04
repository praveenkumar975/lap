package com.java;

class Animal{
	void dog() {
		System.out.println("boww bowww");
	}
}
interface pet{
	void cat();
}
class animals extends Animal implements pet{

	@Override
	public void cat() {
		System.out.println("meeoiii");
		
	}

	@Override
	public void dog() {
		System.out.println("bowwwww");
	} 
}
class New_animal extends Animal implements pet{

	@Override
	public void cat() {
		System.out.println("eating.....");
		
	}
	void dog(){
		System.out.println("sleeping,......");
	}
}
public class Hybrid_Inheritance {//one sub more then super
	
	public static void main(String[] args) {
		New_animal n  = new New_animal();
		n.cat();
		n.dog();
		animals a = new animals();
		a.cat();
		a.dog();
}
}
