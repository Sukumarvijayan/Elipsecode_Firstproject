package restassured;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class JsonAnyGetterserizalize {

	public static void main(String[] args) throws JsonProcessingException {

		JsonAnyGetterpojo anyGetterpojo = new JsonAnyGetterpojo();

		Map<String,Object> mapobj = new HashMap<String,Object>();

		mapobj.put("firstname", "Sukumar");
		mapobj.put("lastname", "vijayan");
		mapobj.put("email", "Sukumar@gmail.com");
		mapobj.put("Skills", Arrays.asList("UFT","Selenium"));

		anyGetterpojo.setEmployee(mapobj);

		ObjectMapper mapper = new ObjectMapper();
		String jsonobj = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(anyGetterpojo);

		System.out.println(jsonobj);
	}


}
