package testNG;

import org.testng.annotations.Test;

public class Dependtestcase {

	@Test ()
	public void firsttestcase() {
		System.out.println("This is first testcase");
	}
	
	@Test (dependsOnMethods = "firsttestcase")
	public void secondtestcase() {
		System.out.println("This is second testcase");
	}
    
	@Test (dependsOnMethods = "secondtestcase")
	public void thirdtestcase() {
		System.out.println("This is third testcase");
	}
}
