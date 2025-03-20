package com.lao.polymarphism;

public class Son extends Parents{
	
	//child class ready to use property method & not ready with Marriage method of parent class
	//in that we can use override..it will not execute the Marriage method of parent class
	//override means->child class is not satisfy with implementation of parent class
	//during run time, it will execute the Marriage method in child class eventhough same class name & same parameter
	@Override
	public void Marriage() {
		System.out.println("My Marriage My rule");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parentclass ref = new chilsclass() ->its a dynamic polymorphism
		Parents str = new Son(); //->its a dynamic polymorphism
		str.property();
		str.Marriage();

	}

}
