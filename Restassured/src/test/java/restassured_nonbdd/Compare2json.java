package restassured_nonbdd;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Compare2json {
	
	static String json1 ="{\r\n"
			+ "        \"id\": \"2\",\r\n"
			+ "        \"last_name\": \"Prasath\",\r\n"
			+ "        \"first_name\": \"Agni\",\r\n"
			+ "        \"email\": \"Agni@gmail.com\"\r\n"
			+ "    }";
	
	static String json2 ="{\r\n"
			+ "        \"id\": \"1\",\r\n"
			+ "        \"first_name\": \"Agni\",\r\n"
			+ "        \"last_name\": \"Prasath\",\r\n"
			+ "        \"email\": \"Agni@gmail.com\"\r\n"
			+ "    }";

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonnode1 = mapper.readTree(json1);
		JsonNode jsonnode2 = mapper.readTree(json2);
		
		System.out.println(jsonnode1.equals(jsonnode2));
	}

}
