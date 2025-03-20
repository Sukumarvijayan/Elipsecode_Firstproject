package Exceptionexamples;

public class Trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			int b= 5;
			int c = a/b;
			System.out.println(c);
		}
		//A Try block can have multiple catch block..developer analyze and have multiple catch based on the need
		 catch (NullPointerException e) {
	    	   System.out.println("Object exception");
			}
		catch (ArithmeticException e) {
			System.out.println("Number exception");
		}
		//Exception parent of all exception , under this only Arithmeticexception(Mumber), nullpointer exception(objectnot present) etc present
		//always use this Exception at the last in catch, if u use at first then below exception wont execute..as its a parent it have all type of child exception to handle
		catch(Exception e) {
			//printStackTrace will show what are the jave exception occur during run time
			e.printStackTrace();
			System.out.println("Dont divide a number by zero");
		}

	}

}
