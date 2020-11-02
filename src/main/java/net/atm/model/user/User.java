package net.atm.model.user;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
	
	private int id;
	private String first_name;
	private String last_name;
	private String password;
	private String email;
	private LocalDateTime  dateCreated;
	
	public User(int id, String firstName, String lastName,String password, String email,LocalDateTime  dateCreated) {
		this.id = id;
		this.first_name = firstName;
		this.last_name = lastName;
		this.password = password;
		this.email = email;
		this.dateCreated = dateCreated;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return first_name;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public String getPassword(){
		return password;
	}

	public String getEmail() {
		return email;
	}
	
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	
	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}
	
	public void setLatsName(String lastName) {
		this.last_name = lastName;
	}

	public void setPassword(String password){
		this.password = password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
}
