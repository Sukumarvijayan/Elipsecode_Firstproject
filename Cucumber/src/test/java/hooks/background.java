package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class background {
	
	   @Before
		public void beforeopeartion() {
			System.out.println("This will run before all scenario");
		}
		
		@After
	    public void afteroperation() {
			System.out.println("This will run after all scenario");
		}
		

}
