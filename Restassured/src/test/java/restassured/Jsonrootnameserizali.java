package restassured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Jsonrootnameserizali {
	
	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		Jsonrootnamepojo getterpojo = new Jsonrootnamepojo();
		
		getterpojo.setId(1);
		getterpojo.setName("Suku");
		getterpojo.setMail("Suku@mail.com");
		

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
		
		String jsonobj = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getterpojo);
		System.out.println(jsonobj);
	}

}
