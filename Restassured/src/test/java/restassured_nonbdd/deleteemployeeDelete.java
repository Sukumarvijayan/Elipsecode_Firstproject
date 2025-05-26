package restassured_nonbdd;

import org.testng.annotations.Test;

import groovyjarjarantlr4.v4.parse.ANTLRParser.sync_return;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleteemployeeDelete {
	
	@Test
	public void deleteemployee() {
		
		RestAssured.baseURI = "http://localhost:3000/";
		
		RequestSpecification requestspecification = RestAssured.given();
		Response response = requestspecification.request(Method.DELETE, "employees/c25b");
		
		//need to use asPrettyString, it will provide the response in align way/proper
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
		
	}

}
