package restassured;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class JsonAnyGetterpojo {

	public Map<String,Object> employee;
    
	@JsonAnyGetter
	public Map<String, Object> getEmployee() {
		return employee;
	}

	public void setEmployee(Map<String, Object> employee) {
		this.employee = employee;
	} 
	
}
