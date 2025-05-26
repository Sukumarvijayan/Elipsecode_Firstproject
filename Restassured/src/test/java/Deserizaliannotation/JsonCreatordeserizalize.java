package Deserizaliannotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonCreatordeserizalize {
	
public static void main(String[] args) throws JsonProcessingException {
		
		String json = "{\r\n"
				+ "  \"name\" : \"Suku\",\r\n"
				+ "  \"mail\" : \"Suku@mail.com\",\r\n"
				+ "  \"ID\" : 1\r\n"
				+ "}\r\n"
				+ "";
		ObjectMapper mapper = new ObjectMapper();
		JsonCreatorpojo pojo = mapper.readValue(json, JsonCreatorpojo.class);
		
	    System.out.println(pojo.getID());
	    System.out.println(pojo.getName());
	    System.out.println(pojo.getMail());
		}

}
