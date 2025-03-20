package com.lao.abstraction;

public class BMW extends Car{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw = new BMW();
		bmw.enginesecret();
		bmw.Comapanyvalut();
	}
	
	//6.If a child(BMW) does not implement all the abstract method of parent class, 
	//then the child class must need to be declared abstract as well
    //Here we implement the abstract method(enginesecret() & Comapanyvalut())  of parent class
	//if we cant implement the abstract method(enginesecret() & Comapanyvalut())  of parent class, it will throw error
	@Override
	public void enginesecret() {
		// TODO Auto-generated method stub
		System.out.println("BMW engine secret");	
	}

	@Override
	public void Comapanyvalut() {
		// TODO Auto-generated method stub
		System.out.println("BMW companyvalut secret");
	}

}
