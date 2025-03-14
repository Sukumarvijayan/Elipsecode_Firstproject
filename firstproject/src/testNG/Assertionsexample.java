package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionsexample {
	 String str = "Suku12";
	 @Test
	 public void opengoogle() {
		 Assert.assertEquals(str, "Suku");
		
	 }

}
