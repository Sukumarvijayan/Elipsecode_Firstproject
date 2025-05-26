package restassured;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;

//@JsonPropertyOrder({"mail","name","id"})
@JsonPropertyOrder (alphabetic = true)
public class JsonPropertyOrderpojo {

	public int id;
	public String name;
	public String mail;
   
	@JsonGetter (value = "CID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@JsonRawValue
	@JsonGetter (value = "Aname")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonGetter (value = "Bname")
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}


}
