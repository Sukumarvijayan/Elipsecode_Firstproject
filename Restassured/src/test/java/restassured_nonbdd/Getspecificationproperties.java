package restassured_nonbdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class Getspecificationproperties {
	
	@Test
	public void Createemployee() {
		
		RestAssured.baseURI = "http://localhost:3000/";
		
		RequestSpecification requestspecification = RestAssured.given().
				header("Content-Type","application/json").
				body("{\r\n"
						+ "\"first_name\": \"Krish\",\r\n"
						+ "\"last_name\": \"vanth\",\r\n"
						+ "\"email\": \"Krish@gmail.com\"\r\n"
						+ "}\r\n"
						+ "   ");
		
		Response response = requestspecification.request(Method.POST, "employees");
		
		//need to use asPrettyString, it will provide the response in align way/proper
		QueryableRequestSpecification specquery = SpecificationQuerier.query(requestspecification);
		
		System.out.println(specquery.getBaseUri());
		System.out.println(specquery.getHeaders());
		System.out.println(specquery.getMethod());
		
	}

}
