package restassured_bddstyle;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class Basicauthwithrestassured {

	@Test
	public void getemployee() {

		given()
		.auth()
		.basic("postman", "password")
		.baseUri("https://postman-echo.com/")
		.when()
		.get("basic-auth")
		.prettyPrint();

	}
}
