package seleniumwait;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;


public class FailedTestcases {

    @Test
	public void testcase1() {
    	//just comparing suku and sukumar, then only tc wil fail
       Assert.assertEquals("Suku", "Sukumar");
	}
    @Test
	public void testcase2() {
    Assert.assertEquals("Kiru", "Kirubha"); 
	}
}
