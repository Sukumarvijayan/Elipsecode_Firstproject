package com.lao.Statickeyword;

public class Staticblock {
    
	//Before main method(public static void main(String[] args)), static will execute first in class
	static {
		  System.out.println("It a First static method");	
	}
	
	static {
		  System.out.println("It a second static method");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("It a Main method");
	}

}
