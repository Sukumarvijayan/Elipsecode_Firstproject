package restassured_bddstyle;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Requestspecificationbuilderexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		RequestSpecification spec = builder.setBaseUri("http://localhost:3000").setBasePath("/employees").build();
       
		RestAssured.given(spec).get("/1").prettyPrint();
		RestAssured.given().spec(spec).get("/1").prettyPrint();

}
}
