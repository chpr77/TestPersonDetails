
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

  
  
