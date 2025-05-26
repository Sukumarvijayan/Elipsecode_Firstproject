package restassured_bddstyle;

import static io.restassured.RestAssured.* ;

import org.testng.annotations.Test;

public class getemployeeGET {
	
	@Test
	public void getemployee() {
		
		 given()
		.baseUri("http://localhost:3000/")
		.when()
		.get("employees")
		.prettyPrint();
		
	}

}
