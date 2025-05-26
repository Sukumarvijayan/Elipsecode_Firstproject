package restassured;

import static io.restassured.RestAssured.given;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;
import com.jayway.jsonpath.spi.mapper.JsonOrgMappingProvider;
import com.jayway.jsonpath.spi.mapper.JsonSmartMappingProvider;

import io.restassured.common.mapper.TypeRef;

public class Deserialization {
	
	 static String jsonobj = "{\r\n"
			+ "  \"firstName\" : \"Sugh\",\r\n"
			+ "  \"email\" : \"Sughi@gmail.com\",\r\n"
			+ "  \"skills\" : [ \"Java\", \"selenium\" ],\r\n"
			+ "  \"lastName\" : \"Sree\"\r\n"
			+ "}";

	
	public static void deserialusingobjetmapper () throws JsonMappingException, JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		//it will read the value from json & store in the EmployeePOJO
		EmployeePOJO employeePOJO = mapper.readValue(jsonobj, EmployeePOJO.class);
		
		System.out.println(employeePOJO.getFirstName());
		System.out.println(employeePOJO.getLastName());
		System.out.println(employeePOJO.getEmail());
		System.out.println(employeePOJO.getSkills());
	}

	
	public static void usingjaywayjsonpath() {
		
	
		
		JacksonMappingProvider MappingProvider = new JacksonMappingProvider();
		
		Configuration configuration = Configuration.builder().mappingProvider(MappingProvider).build();
		EmployeePOJO employeePOJO = JsonPath.using(configuration).parse(jsonobj).read("$", EmployeePOJO.class);
		
		System.out.println(employeePOJO.getFirstName());
		System.out.println(employeePOJO.getLastName());
		System.out.println(employeePOJO.getEmail());
		System.out.println(employeePOJO.getSkills());
	}
	
	
	public static void usingrestassured() {
		
		//io.restassured.path.json.JsonPath coming bec in the same class at the top jayway jsonpath 
		//we are suing .from & .getobject to achive the result
		//$ - read all the key in the json
		
		io.restassured.path.json.JsonPath jsonPath = io.restassured.path.json.JsonPath.from(jsonobj);
		EmployeePOJO employeePOJO = jsonPath.getObject("$", EmployeePOJO.class);
		
		System.out.println(employeePOJO.getFirstName());
		System.out.println(employeePOJO.getLastName());
		System.out.println(employeePOJO.getEmail());
		System.out.println(employeePOJO.getSkills());
	}
	
	public static void usingAsFunction() {
		
		Map<String, Object> Response = given()
			.baseUri("http://localhost:3000/")
			.when()
			.get("employees/1")
			.then()
			.extract()
			.body()
			//we know key always as string & value will diff so using object ,  <Map<String, Object>>
			.as(new TypeRef <Map<String, Object>>() {
			});
		
		System.out.println(Response);
		
		System.out.println(Response.get("id"));
		System.out.println(Response.get("first_name"));
		System.out.println(Response.get("last_name"));
		System.out.println(Response.get("email"));
	}
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		//deserialusingobjetmapper();
		//usingjaywayjsonpath();
		//usingrestassured();
		
		usingAsFunction();
	}

}
