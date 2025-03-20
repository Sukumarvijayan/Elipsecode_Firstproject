package com.lao.abstraction;

//How a class can use an interface?
//Using implement keyword
//Multiple inheritance archived thru interface as below (class Benz extends Car implements upcomingproject, Interface2 or class Benz implements upcomingproject, Interface2)
//in java [public class Benz extends Car, BMW] - not support will throw error
public class Benz extends Car implements upcomingproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car benz = new Benz();
		benz.enginesecret();
		benz.Comapanyvalut();
	}
	
	//If a child(Benz) does not implement all the abstract method of parent class (here car & upcomingproject(interface), 

	 //Here we implement the abstract method(enginesecret() & Comapanyvalut())  of parent class "Car"
	//also //Here we implement the abstract method(employee() & employee1())  of parent class upcomingproject(interface)
	//if we cant implement the abstract method(enginesecret() & Comapanyvalut())  of parent class, it will throw error
 

	
	//below for Car class abstract methods
	@Override
	public void enginesecret() {
		// TODO Auto-generated method stub
		System.out.println("Benz engine secret");	
	}

	@Override
	public void Comapanyvalut() {
		// TODO Auto-generated method stub
		System.out.println("Benz companyvalut secret");
	}

	//below for upcomingproject interface abstract methods
	@Override
	public void Methods1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Methods2() {
		// TODO Auto-generated method stub
		
	}

}
