package com.javatpoint.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class PersonAddress implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	PersonAddressIdentity personIdentity;	
	public PersonAddressIdentity getPersonIdentity() {
		return personIdentity;
	}
	public void setPersonIdentity(PersonAddressIdentity personIdentity) {
		this.personIdentity = personIdentity;
	}
	
	@Column(name="state")	
	private String state;
	@Column(name="city")	
	private String city;
	@Column(name="street")	
	private String street;
	@Column(name="postal_Code")	
	private String postalCode;
	public PersonAddress() {}
	public PersonAddress(PersonAddressIdentity personAddressId, String state, String city, String street, String postalCode) {
		super();
		this.personIdentity = personAddressId;
		this.state = state;
		this.city = city;
		this.street = street;
		this.postalCode = postalCode;
	}
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
