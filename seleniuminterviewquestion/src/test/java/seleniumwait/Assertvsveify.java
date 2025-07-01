package seleniumwait;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertvsveify {

	@Test(priority = 0)
	public void verifytest() {
		//softassertion 
		SoftAssert softAssert = new SoftAssert();
		System.out.println(" Before Soft assetion");
		softAssert.assertEquals(true, false);
		System.out.println(" After Soft assetion");
	}


	@Test(priority = 1)
	public void asserttest() {
		//hardassertion 
		System.out.println(" Before Hard assetion");
		Assert.assertEquals(true, false);
		System.out.println(" After Hard assetion");
	}



}
