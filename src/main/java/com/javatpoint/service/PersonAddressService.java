package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.model.PersonAddress;
import com.javatpoint.model.PersonAddressIdentity;
import com.javatpoint.repository.PersonAddressRepository;
//defining the business logic
@Service
public class PersonAddressService 
{
	@Autowired
	PersonAddressRepository personAddressRepository;
	
	//getting all books record by using the method findaAll() of CrudRepository
	public List<PersonAddress> getAllPersonsAddress() 
	{
		List<PersonAddress> personsAddress = new ArrayList<PersonAddress>();
		personAddressRepository.findAll().forEach(persAdd -> personsAddress.add(persAdd));
		return personsAddress;
	}
	//getting a specific record by using the method findById() of CrudRepository
	public Optional<PersonAddress> getPersonAddressById(int id,int personId)
	{
		PersonAddressIdentity personAddressIdentity=new PersonAddressIdentity(id, personId);
		
		return personAddressRepository.findById(personAddressIdentity);
	}
	//saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(PersonAddress personAddress) 
	{
		personAddressRepository.save(personAddress);
	}
	//deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id,int personId) 
	{	
		PersonAddressIdentity personAddressIdentity=new PersonAddressIdentity(id, personId);
		personAddressRepository.deleteById(personAddressIdentity);
	}
	//updating a record
	public void update(PersonAddress personAddress, int addressId) 
	{
		personAddressRepository.save(personAddress);
	}
}