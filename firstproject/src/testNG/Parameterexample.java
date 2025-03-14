package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterexample {
	
	@Test
	@Parameters("Username")
	public void Parameter(String name) {
		System.out.println("The Name is"+ name);
	}

}
