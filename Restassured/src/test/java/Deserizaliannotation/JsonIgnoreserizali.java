package Deserizaliannotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import restassured.JsonGetterpojo;

public class JsonIgnoreserizali {
	
	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		JsonIgnorepojo Ignorepojo = new JsonIgnorepojo();
		
		//Ignorepojo.setId(1);
		//Ignorepojo.setName("Suku");
		Ignorepojo.setMail("Suku@mail.com");
		

		ObjectMapper mapper = new ObjectMapper();
		String jsonobj = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Ignorepojo);

		System.out.println(jsonobj);
	}


}
