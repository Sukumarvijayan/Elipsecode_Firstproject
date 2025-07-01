package seleniumwait;

import org.testng.annotations.Test;

public class Timoutexamples {
	
	@Test(timeOut = 2000, expectedExceptions = org.testng.internal.thread.ThreadTimeoutException.class)
	  public void Test1() throws InterruptedException {
		Thread.sleep(3000);
		  System.out.println("Test1");
	  }

}
