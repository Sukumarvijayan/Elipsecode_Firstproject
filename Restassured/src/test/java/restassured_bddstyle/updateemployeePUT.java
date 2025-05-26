package restassured_bddstyle;

import static io.restassured.RestAssured.* ;

import org.testng.annotations.Test;

public class updateemployeePUT {
	
	@Test
	public void getemployee() {
		
		 given()
			.baseUri("http://localhost:3000/")
			.header("Content-Type","application/json")
			.body("{\r\n"
					+ "\"first_name\": \"Subha\",\r\n"
					+ "\"last_name\": \"Arun\",\r\n"
					+ "\"email\": \"Subha@gmail.com\"\r\n"
					+ "}\r\n"
					+ "   ")
			.when()
			.put("employees/9a8e")
			.prettyPrint();
		
	}

}
