package restassured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyOrderserizali {

	
	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		JsonPropertyOrderpojo getterpojo = new JsonPropertyOrderpojo();
		
		getterpojo.setId(1);
		getterpojo.setName("Suku");
		getterpojo.setMail("Suku@mail.com");
		

		ObjectMapper mapper = new ObjectMapper();
		String jsonobj = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getterpojo);
		System.out.println(jsonobj);
	}
}
