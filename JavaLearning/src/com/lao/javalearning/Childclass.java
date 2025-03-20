package com.lao.javalearning;

public class Childclass extends Parentclass{
	
	public Childclass() {
		
		//by using extends[Access modifier], it will go and check the other class[eg parent class]
		//by default super() keyword will be present in the first line of constructor[cant see in naked eyes]
		//super() keyword will execute the parent class first
		System.out.println("This is Child class");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stuby
		
		Childclass class1 = new Childclass();

	}

}
