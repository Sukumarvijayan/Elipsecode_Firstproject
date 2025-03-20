package com.lao.inheritance;

public class BMW extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//here by using extends keyword, BMW class use car class methods
		BMW bmw = new BMW();
		bmw.engine();
		int i = bmw.wheel;
		System.out.println("No of wheels"+i);
	}

}
