package restassured_bddstyle;

import static io.restassured.RestAssured.* ;

import org.testng.annotations.Test;

public class DeleteemployeeDELETE {
	
	@Test
	public void getemployee() {
		
		 given()
		.baseUri("http://localhost:3000/")
		.when()
		.delete("employees/9a8e")
		.prettyPrint();
		
	}

}
