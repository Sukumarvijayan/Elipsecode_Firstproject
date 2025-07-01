package seleniumwait;

import org.testng.annotations.Test;

public class TestMultipletimes {
	
	@Test(invocationCount = 3)
	  public void Test1() {
		  System.out.println("Test1");
	  }

}
