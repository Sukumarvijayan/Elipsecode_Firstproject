package com.lao.Loop;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For loop ->[Initialization; condition; increment in one line]
		int i;
		for(i=0;i<=10;i++) {
			System.out.println("My name is Sukumar");
		}
		//While Loop->same but Initialization; condition; increment all in different lines]
		//Her first check the condition & then allow to execute the code
		//its called as Entry control loop
		int j=0;
		while (j<=10) {
			System.out.println("My name is Sukumar");
			j++;
		}
		//Do while Loop->Here condition at the last.Her first execute the code & then check the condition
		//its called as Exit control loop
		int k=0;
		do {
			System.out.println("My name is Sukumar");
			k++;	
		} while (k<=10);
	}
}
