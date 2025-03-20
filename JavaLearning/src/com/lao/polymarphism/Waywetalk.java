package com.lao.polymarphism;

public class Waywetalk {
	//we can give class names also in the argument(eg Parents)..Parents class also created in same packages
	//created 2 method with same name , then only its Overloading
	//Both method, argument is different 
	//all done in the same class (Waywetalk)
	public void talk(Parents styleoftaking) {
		System.out.println("Polite");
		
	}

	public void talk(parter styleoftaking) {
		System.out.println("Love");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Waywetalk str = new Waywetalk();
		//In order to call talk , created object for parents class
		Parents parents = new Parents();
		str.talk(parents);
		
		parter parter = new parter();
		str.talk(parter);

	}

}
