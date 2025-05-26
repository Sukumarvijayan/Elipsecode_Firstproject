package Deserizaliannotation;

import java.io.IOException;

import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class JacksonInjectdeserizalize {

	public static void main(String[] args) throws IOException {

		String json = "{\r\n"
				+ "  \"mail\" : \"Suku@mail.com\",\r\n"
				+ "  \"ID\" : 1\r\n"
				+ "}\r\n"
				+ "";
		
	//by using InjectableValues , we are inject the string value "suku" in Pojo
		InjectableValues injectableValues = new InjectableValues.Std().addValue(String.class, "Suku");
		ObjectMapper mapper = new ObjectMapper();
		ObjectReader reader =   mapper.reader(injectableValues);
		
		JacksonInjectpojo pojo = reader.readValue(json, JacksonInjectpojo.class);

		System.out.println(pojo.getName());
		
	}

}
