package Deserizaliannotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSetterserizalize {
	
	public static void main(String[] args) throws JsonProcessingException {
		
		String json = "{\r\n"
				+ "  \"name\" : \"Suku\",\r\n"
				+ "  \"mail\" : \"Suku@mail.com\",\r\n"
				+ "  \"employeeID\" : 1\r\n"
				+ "}\r\n"
				+ "";
		ObjectMapper mapper = new ObjectMapper();
		JsonSetterpojo pojo = mapper.readValue(json, JsonSetterpojo.class);
		
		System.out.println(pojo.getId());
		
		}

}
