package com.lao.Loop;

public class switchcaseexamples {
	
	static String name = "Suku123";
	
	public void names() {
		
	switch (name) {
	case "Suku123": {
		System.out.println("Matched at first run");
		break;
	}
	case "Babu": {
		System.out.println("Matched at first run");
	}
	case "Hari": {
		System.out.println("Matched at first run");
	}
	default:
		 System.out.println("Not at all Matched in all run");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		switchcaseexamples str= new switchcaseexamples();
		str.names();


	}

}
