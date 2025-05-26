package restassured;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="Employee")
public class Jsonrootnamepojo {
	
	public int id;
	public String name;
	public String mail;

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


}
