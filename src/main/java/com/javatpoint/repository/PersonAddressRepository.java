package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;

import com.javatpoint.model.PersonAddress;
import com.javatpoint.model.PersonAddressIdentity;
public interface PersonAddressRepository extends CrudRepository<PersonAddress, PersonAddressIdentity>
{
	
}
