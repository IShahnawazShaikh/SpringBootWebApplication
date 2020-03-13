package com.prolog.SpringBootWebApplication.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class NewUser {
	 @Id
	 private String Email;
	@GeneratedValue
	private long id;
  private String Name;
  private String Phone;
  private String Password;
  public NewUser() {}
  public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}

public String getEmail() {
	return Email;
}
public NewUser(String name, String email, String phone, String password) {
	super();
	Email = email;
	//this.id = id2;
	Name = name;
	Phone = phone;
	Password = password;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhone() {
	return Phone;
}
public void setPhone(String phone) {
	Phone = phone;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = 10;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}

}
