package com.lao.Statickeyword;

public class Staticvaribles {
	
	static int intvarible = 0;
	String intvariable1l;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		intvarible=500;
		//intvariable1l = "suku"
		
		Staticvaribles object1 = new Staticvaribles();
		object1.intvarible = 1000;
		object1.intvariable1l = "Suku";
		
		Staticvaribles object2 = new Staticvaribles();
		object2.intvarible = 2000;
		object2.intvariable1l = "Jothi";
		
		//statis variables(intvarible) will have last stored values only..Only a single copy of static variables is created 
		//and shared among all the instance(object) of the class 
		
		System.out.println(object1.intvarible);
		System.out.println(object1.intvariable1l);
		System.out.println(object2.intvarible);
		System.out.println(object2.intvariable1l);
	}

}
