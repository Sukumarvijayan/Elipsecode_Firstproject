package restassured;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee1POJO {

	public static void main(String[] args) throws JsonProcessingException {
		
		EmployeePOJO Employee1POJO = new EmployeePOJO();
		Employee1POJO.setFirstName("Sugh");
		Employee1POJO.setLastName("Sree");
		Employee1POJO.setEmail("Sughi@gmail.com");
		Employee1POJO.setSkills(Arrays.asList("Java","selenium"));
		
		System.out.println(Employee1POJO.getFirstName());
		System.out.println(Employee1POJO.getLastName());
		System.out.println(Employee1POJO.getEmail());
		System.out.println(Employee1POJO.getSkills());
		
		ObjectMapper mapper = new ObjectMapper();
		String JSONobj = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Employee1POJO);
		System.out.println(JSONobj);
		
	}
}
