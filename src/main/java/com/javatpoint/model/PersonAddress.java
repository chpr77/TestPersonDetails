package com.javatpoint.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class PersonAddress implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_Id")
	private int addressId;
	@Column(name="PERSON_ID")
    private int personId; 	
	@Column(name="state")	
	private String state;
	@Column(name="city")	
	private String city;
	@Column(name="street")	
	private String street;
	@Column(name="postal_Code")	
	private String postalCode;
	public int getAddressId() {
		return addressId;
	}
	public PersonAddress(int addressId, int personId, String state, String city, String street, String postalCode) {
		super();
		this.addressId = addressId;
		this.personId = personId;
		this.state = state;
		this.city = city;
		this.street = street;
		this.postalCode = postalCode;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
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
	public short getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(short postalCode) {
		this.postalCode = postalCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
