package Deserizaliannotation;

import com.fasterxml.jackson.annotation.JacksonInject;

public class JacksonInjectpojo {
	
	public int ID;
	@JacksonInject
	public String name;
	public String mail;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
