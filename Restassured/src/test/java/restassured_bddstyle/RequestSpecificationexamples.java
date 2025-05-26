package restassured_bddstyle;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationexamples {


	RequestSpecification requestSpecification;

	@BeforeSuite
	public void setrequestSpecification() {
		requestSpecification = 
				given().baseUri("http://localhost:3000").basePath("/employees");

		RestAssured.requestSpecification = requestSpecification;
		//RequestSpecification requestSpecification1 = RestAssured.with().baseUri("http://localhost:3000/").basePath("employees");
	}

	@Test
	public void getallemployee() {

		given()
		//need to use .spec & pass the requestSpecification from above
		.when()
		.get()
		.prettyPrint();

	}

	@Test
	public void getoneemployee() {

		given()
		//need to use .spec & pass the requestSpecification from above
		.when()
		//just need to pass 1 here
		.get("/1")
		.prettyPrint();

	}


	@Test
	public void createemployee() {

		RequestSpecification Specification = 
				given().baseUri("http://localhost:3000").basePath("/employees").contentType(ContentType.JSON);

		given()
		.spec(Specification)
		.body("{\r\n"
				+ "\"first_name\": \"Priya\",\r\n"
				+ "\"last_name\": \"Nirty\",\r\n"
				+ "\"email\": \"Priya@gmail.com\"\r\n"
				+ "}\r\n"
				+ "   ")
		.when()
		.post()
		.prettyPrint();

	}

}
