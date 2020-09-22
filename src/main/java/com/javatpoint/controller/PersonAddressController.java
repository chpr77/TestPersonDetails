package com.javatpoint.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.PersonAddress;
import com.javatpoint.service.PersonAddressService;
//mark class as Controller
@RestController
public class PersonAddressController 
	{	
	
	@Autowired
	PersonAddressService personAddressService;	
	
	//Address 
	
	@GetMapping("/allPersonAddress")
	private List<PersonAddress> getAllPersonsAddress() 
	{
		return personAddressService.getAllPersonsAddress();
	}
	
	@PostMapping("/savePersonAddress")
	private PersonAddress savePerson(@RequestBody PersonAddress personAddress) 
	{
		personAddressService.saveOrUpdate(personAddress);
		return personAddress;
	}
	
	@DeleteMapping("/deletePersonAddress/{addressId}/{personId}")
	private void deletePersonAddress(@PathVariable("addressId") int id,@PathVariable("personId") int personId) 
	{
		personAddressService.delete(id, personId);
	}
	
	
}
