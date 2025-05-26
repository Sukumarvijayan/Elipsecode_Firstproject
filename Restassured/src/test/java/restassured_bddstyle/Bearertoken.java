package restassured_bddstyle;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Bearertoken {
	
	@Test
	public void Beaertokenauth() {

		given()
		.header("Authorization", "Bearer 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")
		.when()
		.get("https://api.github.com/user/repos ")
		.prettyPrint();

	}

}
