package restassured_bddstyle;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Oauth2 {
	
	@Test
	public void Beaertokenauth() {

		given()
		.auth()
		.oauth2("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")
		.when()
		.get("https://api.github.com/user/repos ")
		.prettyPrint();

	}

}
