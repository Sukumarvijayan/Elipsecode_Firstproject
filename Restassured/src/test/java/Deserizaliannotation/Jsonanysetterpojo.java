package Deserizaliannotation;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class Jsonanysetterpojo {
	
	public Map<String,Object> employee = new HashMap<String,Object>();

	public Map<String, Object> getEmployee() {
		return employee;
	}
	@JsonAnySetter
	public void setEmployee(String key, Object value) {
		employee.put(key, value);
	}



	
	

}
