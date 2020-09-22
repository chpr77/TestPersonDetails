package com.javatpoint.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

import com.sun.istack.NotNull;

@Embeddable
public class PersonAddressIdentity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue
	@NotNull
	@Column(name="ADDRESS_ID")
	private int addressId;
	
	@NotNull
	@Column(name="PERSON_ID")
    private int personId; 	
	
	public int getAddressId() {
		return addressId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + addressId;
		result = prime * result + personId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonAddressIdentity other = (PersonAddressIdentity) obj;
		if (addressId != other.addressId)
			return false;
		if (personId != other.personId)
			return false;
		return true;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public PersonAddressIdentity(){
		
	}

	public PersonAddressIdentity(int addressId, int personId) {
		super();
		this.addressId = addressId;
		this.personId = personId;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
