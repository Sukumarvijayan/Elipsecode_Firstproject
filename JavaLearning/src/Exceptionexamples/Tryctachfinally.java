package Exceptionexamples;

public class Tryctachfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Inside Try block");
			System.exit(0);
		}
		//no exception, so it wont execute Catch block..but finally always execute
       catch(Exception e) {
    	   System.out.println("Inside Catch block");
       }
       finally {
    	   System.out.println("Inside Finally block");
	}
	}

}
