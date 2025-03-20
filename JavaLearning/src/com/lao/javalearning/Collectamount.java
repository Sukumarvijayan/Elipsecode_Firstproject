package com.lao.javalearning;

public class Collectamount {
	
	//eg dad ask son to collect amount from other person & give it back
	public Integer collectedamount = 2000;
	
	//here Integer is the returntype & retuenvalue send back to the main() method
	public Integer collectamountandgivetome() {
		System.out.println("Son collected the amount from other person" +collectedamount );
		//need to add below type for returntype
		return collectedamount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collectamount amount = new Collectamount();
	    Integer amountreceived = amount.collectamountandgivetome();
		System.out.println("Dad Collected amount from son" + amountreceived);
		
	}

}
