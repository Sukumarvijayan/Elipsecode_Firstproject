package com.lao.javalearning;

public class Noargumentconstructor {
	
	int employeeid;
	String employeename;
	
	//below is a No argument constructor
	Noargumentconstructor(){
		employeeid=1;
		employeename="Suku";
		System.out.println("Employee object is created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//below line will calling the Noargumentconstructor automaticllay while execution & we are not calling using object
		Noargumentconstructor employee = new Noargumentconstructor();

	}

}
