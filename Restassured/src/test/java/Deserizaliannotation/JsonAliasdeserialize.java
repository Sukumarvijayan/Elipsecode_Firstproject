package Deserizaliannotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAliasdeserialize {
	
public static void main(String[] args) throws JsonProcessingException {
		
		String json = "{\r\n"
				+ "  \"name\" : \"Suku\",\r\n"
				+ "  \"mail\" : \"Suku@mail.com\",\r\n"
				+ "  \"employeeID\" : 1\r\n"
				+ "}\r\n"
				+ "";
		ObjectMapper mapper = new ObjectMapper();
		JsonAliaspojo pojo = mapper.readValue(json, JsonAliaspojo.class);
		
		System.out.println(pojo.getId());
		
		}


}
