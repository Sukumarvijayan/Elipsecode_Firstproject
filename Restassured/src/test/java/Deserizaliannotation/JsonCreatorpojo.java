package Deserizaliannotation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonCreatorpojo {
	
	public int ID;
	public String name;
	public String mail;
	
	@JsonCreator
	public  JsonCreatorpojo(
			@JsonProperty("ID")
			int ID,
			@JsonProperty("name")
			String name,
			@JsonProperty("mail")
			String mail
			) {
		this.ID =ID;
		this.name = name;
		this.mail = mail;
		
	}
	
	public int getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMail() {
		return mail;
	}
	
	
	
}
