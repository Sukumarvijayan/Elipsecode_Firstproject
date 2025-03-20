package com.lao.javalearning;

public class Constructoroverloading {
	
	Constructoroverloading(){
		System.out.println("Drawing any object");
	}
	
    Constructoroverloading(String str){
    	System.out.println("Drawing" +str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Based on the argument in the objeect creation , respective Constructor called. its called onstructoroverloading
		
		Constructoroverloading draw = new Constructoroverloading();
		Constructoroverloading draw1 = new Constructoroverloading("Circle");

	}

}
