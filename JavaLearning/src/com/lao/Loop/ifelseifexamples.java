package com.lao.Loop;

public class ifelseifexamples {
	
	static String name = "Suku123";
	
	public void names() {
		
		if(name.equals("Babu")) {
			System.out.println("Matched at first run");
		}
		else if(name.equals("Jothi")){
			System.out.println("Matched at second run");
		}
        else if(name.equals("Suku1")){
        	System.out.println("Matched at third run");
		}
       else {
    	   System.out.println("Not at all Matched in all run");
       }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifelseifexamples str= new ifelseifexamples();
		str.names();

}
}
