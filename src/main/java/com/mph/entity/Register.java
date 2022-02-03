package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
*
* @author Uday geeth raj patil
*/
@Entity
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rid;
private String firstname;
private String lastname;
private String username;
private String city;
private String state;
private int zip;
private String mobileno;
private String distributername;
private String email;
private String password;
public Register () {
	super();
	// TODO Auto-generated constructor stub
}

public Register(int rid, String firstname, String lastname, String username, String city, String state, int zip,
		String mobileno, String distributername, String email, String password) {
	super();
	this.rid = rid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.username = username;
	this.city = city;
	this.state = state;
	this.zip = zip;
	this.mobileno = mobileno;
	this.distributername = distributername;
	this.email = email;
	this.password = password;
}
public int getRid() {
	return rid;
}
public void set(int rid) {
	this.rid = rid;
}

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
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getDistributername() {
	return distributername;
}
public void setDistributername(String distributername) {
	this.distributername = distributername;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "Register [rid="+ rid +",firstname=" + firstname + ", lastname=" + lastname + ", username=" + username + ", city="
			+ city + ", state=" + state + ", zip=" + zip + ", mobileno=" + mobileno + ", distributername="
			+ distributername + ", email=" + email + ", password=" + password + " ]";
}


	

}