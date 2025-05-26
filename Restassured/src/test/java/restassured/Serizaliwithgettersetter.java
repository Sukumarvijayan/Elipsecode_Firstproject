package restassured;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serizaliwithgettersetter {
	static PojoSerizaliwithgettersetter Serizaliwithgettersetter = new PojoSerizaliwithgettersetter();
	static ObjectMapper mapper = new ObjectMapper();

	public static void serixalize () throws JsonProcessingException {

		Serizaliwithgettersetter.setFirstName("Sughi");
		Serizaliwithgettersetter.setLastName("Sree");
		Serizaliwithgettersetter.setEmail("Sughi@gmail.com");
		Serizaliwithgettersetter.setSkills(Arrays.asList("Java","selenium"));
		String JSONobj = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Serizaliwithgettersetter);
		System.out.println(JSONobj);
	}

	public static void deserixalize () throws JsonMappingException, JsonProcessingException {

		String Employeejson ="{\r\n"
				+ "  \"firstName\" : \"Sugh\",\r\n"
				+ "  \"email\" : \"Sughi@gmail.com\",\r\n"
				+ "  \"skills\" : [ \"Java\", \"selenium\" ],\r\n"
				+ "  \"lastName\" : \"Sree\"\r\n"
				+ "}";

		PojoSerizaliwithgettersetter obj = mapper.readValue(Employeejson, PojoSerizaliwithgettersetter.class);

		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		System.out.println(obj.getEmail());
		System.out.println(obj.getSkills());
	}

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		//serixalize();
		deserixalize ();

	}

}
