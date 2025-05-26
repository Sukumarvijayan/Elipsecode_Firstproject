package restassured;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import com.github.fge.jsonschema.messages.JsonSchemaValidationBundle;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class Reastassuredjsonschemavalidation {

	@Test (enabled = false)
	public void validationusingjsonschmainclaspath() {

		File inputjson = new File("src/test/resources/input.json");

		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body(inputjson)
		.when()
		.post("employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));

		//note here we should not provide full path..only last name(schema.json)
		//if we are keeping the schema json under resources folder, then we have use matchesJsonSchemaInClasspath & provide the name alone
	}

	@Test  
	public void validationusingjsonschma() {

		File inputjson = new File("src/test/resources/input.json");
		File jsonschema = new File("src/test/resources/schema.json");

		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body(inputjson)
		.when()
		.post("employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(jsonschema));

	}
}
