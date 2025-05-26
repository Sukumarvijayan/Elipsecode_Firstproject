package restassured_bddstyle;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

public class createemployeefromexternalfile {
	
	@Test
	public void createemployeeexternalfile() {
		
		File jsconfile  = new File("postdata.json");
		
		given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body(jsconfile)
		.when()
		.post("employees")
		.prettyPrint();
		
	}

}
