package com.lao.abstraction;

//2.If a class is having one abstract method then class should be declared as abstract
public abstract class Car {
	
	//1.below method Body {} not present, hiding the details(unimplemented method), then the method should be declared abstract

	public abstract void enginesecret();
	
	public abstract void Comapanyvalut();
	
	//3.Class may or may not have implementation method(eg one method with hiding the details & other method without hiding the details also allow]
	//below method showing the details(implementation method)
	public void carrevenue() {
			System.out.println("Car revenue details");
	}

	public void employee() {
		// TODO Auto-generated method stub
		
	}
	
	//5.we cant create object for abstract class
	//Car car new Car();
}


