package Deserizaliannotation;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JsonSetterpojo {

	public int id;
	public String name;
	public String mail;

	
	public int getId() {
		return id;
	}
	
	@JsonSetter (value = "employeeID")
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




}
