package com.lao.javalearning;
public class Bankaccount {
	
	//Here Long, String, Integer are wrapper class[its a object we can call inside the methods	
	//for long datatype need to append "l" at the last
	Long accountnumber = 1234566l;
	//String datatype, value need to give in double quotes
	String accountname = "Suku";
	Integer accountbalance = 1000;
	
	public void getbalance() {
		System.out.println(accountbalance);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//In order to call the getbalance fucntion, we need to create a object for class & then call method
		//classname objectname = new clasname()
		
		Bankaccount account = new Bankaccount();
		account.getbalance();	
	}

}
