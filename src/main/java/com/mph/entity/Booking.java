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
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	
	private String ctype;
	private String cname;
	private String mail;
	private int noofcylinders;
	private String city;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int bid, String ctype, String cname, String mail, int noofcylinders, String city) {
		super();
		this.bid = bid;
		this.ctype = ctype;
		this.cname = cname;
		this.mail = mail;
		this.noofcylinders = noofcylinders;
		this.city = city;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getNoofcylinders() {
		return noofcylinders;
	}
	public void setNoofcylinders(int noofcylinders) {
		this.noofcylinders = noofcylinders;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Booking [bid=" + bid + ", ctype=" + ctype + ", cname=" + cname + ", mail=" + mail + ", noofcylinders="
				+ noofcylinders + ", city=" + city + "]";
	}
	
	

}