package restassured;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class serizalization {
	
	public static void main(String[] args) {
		
		Map<String, Object> jsonobject = new HashMap<String, Object>();
		
		jsonobject.put("first_name", "Radha");
		jsonobject.put("last_name", "Mani");
		jsonobject.put("email", "Radha@gmail.com");
		
		List<String> jsonArray = new ArrayList<String>();
		
		jsonArray.add("Java");
		jsonArray.add("Selenium");
		
		jsonobject.put("Skils", jsonArray);
		
		System.out.println(jsonobject);
		
		given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body(jsonobject)
		.when()
		.post("employees");
	}

}
