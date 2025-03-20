package com.lao.javalearning;

public class Parameterizedconstructor<animalname> {
	
	String animalname;
	String animaltype;
	
	Parameterizedconstructor(String string, String string2){
		 animalname =string ;
		 animaltype = string2;
	}
	
	public void Animaldetails() {
		System.out.println("Animal name is" +animalname+ "Animal Type is"+animaltype);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while creating the object itself we are assign the paramter 
		Parameterizedconstructor Animal = new Parameterizedconstructor("Duck", "Omnivorses");
		Animal.Animaldetails();
		
		Parameterizedconstructor Animal1 = new Parameterizedconstructor("Lion", "Omnivorses");
		Animal1.Animaldetails();

	}

}
