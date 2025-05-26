package restassured_bddstyle;

import static io.restassured.RestAssured.* ;

import org.testng.annotations.Test;

public class createemployeePOST {

	
	@Test
	public void createemployee() {
		
		 given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"first_name\": \"Priya\",\r\n"
				+ "\"last_name\": \"Nirty\",\r\n"
				+ "\"email\": \"Priya@gmail.com\"\r\n"
				+ "}\r\n"
				+ "   ")
		.when()
		.post("employees")
		.prettyPrint();
		
	}
}
