package seleniumwait;

import org.testng.annotations.Test;

public class AlwaysrunAttributes {
	
	@Test(timeOut=2000)
	public void parentspremmisionforlve() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Premission waiting");
	}
	
	@Test(dependsOnMethods = "parentspremmisionforlve", alwaysRun = true)
	public void Lovemarriage() {
		System.out.println("marriage Happened");
	}

}
