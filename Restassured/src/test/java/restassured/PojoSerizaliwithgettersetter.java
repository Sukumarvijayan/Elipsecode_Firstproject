package restassured;

import java.util.List;

public class PojoSerizaliwithgettersetter {
	
	private String firstName;
	public String getFirstName() {
		System.out.println("Getter"+firstName);
		return firstName;
	}
	public void setFirstName(String firstName) {
		System.out.println("Setter"+firstName);
		this.firstName = firstName;
	}
	public String getLastName() {
		System.out.println("Getter"+LastName);
		return LastName;
	}
	public void setLastName(String lastName) {
		System.out.println("Setter"+lastName);
		LastName = lastName;
	}
	public String getEmail() {
		System.out.println("Getter"+email);
		return email;
	}
	public void setEmail(String email) {
		System.out.println("Setter"+email);
		this.email = email;
	}
	public List getSkills() {
		System.out.println("Getter"+skills);
		return skills;
	}
	public void setSkills(List skills) {
		System.out.println("Setter"+skills);
		this.skills = skills;
	}
	private String LastName;
	private String email;
	private List skills;

}
