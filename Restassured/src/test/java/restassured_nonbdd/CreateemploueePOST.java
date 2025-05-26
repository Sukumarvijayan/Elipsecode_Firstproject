package restassured_nonbdd;

import org.testng.annotations.Test;

import groovyjarjarantlr4.v4.parse.ANTLRParser.sync_return;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateemploueePOST {


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
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
		
	}
}
