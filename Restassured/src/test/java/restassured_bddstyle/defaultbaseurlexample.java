package restassured_bddstyle;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
public class defaultbaseurlexample {
	
	@Test
	public void getemployee() {
		
		 given()
		.log()
		.all()
		.when()
		.get();
		
	}

}
