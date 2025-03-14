package testNG;

import org.testng.annotations.Test;

public class Sampletestcase {
	
	
	@Test (priority = 3)
	public void firsttestcase() {
		System.out.println("This is first testcase");
	}
	
	@Test (priority = 1)
	public void secondtestcase() {
		System.out.println("This is second testcase");
	}
    
	@Test (priority = 2, enabled = false)
	public void thirdtestcase() {
		System.out.println("This is third testcase");
	}


}
