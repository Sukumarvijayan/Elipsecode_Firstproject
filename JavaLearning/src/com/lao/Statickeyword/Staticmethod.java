package com.lao.Statickeyword;

public class Staticmethod {
	
	
	public static void staticmethod1() {
		System.out.println("It a Static Method");
		//We cant call Non static method from static method 
		//staticmethod2();
	}
    
	public void staticmethod2() {
		//We can call static method from non static method but not otherwise
		staticmethod1();
		System.out.println("It a Non Static Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if the method declare with static(public static void staticmethod1(), then we can the method
		//without creating object.
		staticmethod1();
		
		Staticmethod method1 = new Staticmethod();
		method1.staticmethod2();
	}
}
