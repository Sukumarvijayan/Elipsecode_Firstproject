package restassured_bddstyle;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class APIKeyauth {
	
	@Test (enabled = false)
	public void APIkeyauth() {

		given()
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather?q=trichy&appid=c2481008f5f70b95493d15e2a893ae6d")
		.prettyPrint();

	}
	
	@Test (enabled = false)
	public void APIkeyauthusingparams() {

		given()
		.queryParam("q", "trichy")
		.queryParam("appid", "c2481008f5f70b95493d15e2a893ae6d")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather")
		.prettyPrint();

	}
	
	@Test
	public void APIkeyauthusingheader() {

		given()
		.queryParam("q", "trichy")
		.header("appid", "c2481008f5f70b95493d15e2a893ae6d")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather")
		.prettyPrint();

	}


}
