package restassured;

import com.fasterxml.jackson.annotation.JsonGetter;

public class JsonGetterpojo {
	
	public int id;
	
	@JsonGetter (value = "employeeID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String name;
	public String mail;
	
	
	
}
