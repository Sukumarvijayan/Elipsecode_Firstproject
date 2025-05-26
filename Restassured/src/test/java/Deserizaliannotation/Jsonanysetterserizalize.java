package Deserizaliannotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jsonanysetterserizalize {
	
	public static void main(String[] args) throws JsonProcessingException {
	
	String json = "{\r\n"
			+ "  \"firstName\" : \"Sugh\",\r\n"
			+ "  \"email\" : \"Sughi@gmail.com\",\r\n"
			+ "  \"skills\" : [ \"Java\", \"selenium\" ],\r\n"
			+ "  \"lastName\" : \"Sree\"\r\n"
			+ "}";
	
	ObjectMapper mapper = new ObjectMapper();
	Jsonanysetterpojo pojo = mapper.readValue(json, Jsonanysetterpojo.class);
	
	System.out.println(pojo.getEmployee());
	
	}

}
