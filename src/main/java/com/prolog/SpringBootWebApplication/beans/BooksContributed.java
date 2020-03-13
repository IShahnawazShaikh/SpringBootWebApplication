package com.prolog.SpringBootWebApplication.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="find_all_bookC",query="SELECT U FROM BooksContributed U WHERE U.coursetype=:type")
@NamedQuery(name="find_all_bookCpp",query="SELECT U FROM BooksContributed U WHERE U.coursetype=:type")

@Table(name="BookTable")
public class BooksContributed {
@Column(name="BookName")	
private String firstname;
@Column(name="AuthorName")	
private String lastname;
@Column(name="coursetype")
private String coursetype;
@Column(name="contributeBy")
private String CName;

public String getCName() {
	return CName;
}
public void setCName(String cName) {
	CName = cName;
}
public String getCoursetype() {
	return coursetype;
}
public void setCoursetype(String coursetype) {
	this.coursetype = coursetype;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
@Id
@GeneratedValue
private long id;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}

}
