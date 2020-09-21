package com.javatpoint.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.Books;
import com.javatpoint.model.Person;
import com.javatpoint.model.PersonAddress;
import com.javatpoint.service.BooksService;
import com.javatpoint.service.PersonAddressService;
import com.javatpoint.service.PersonService;
//mark class as Controller
@RestController
public class PersonController 
	{
	
	@Autowired
	PersonService personService;
	
	@Autowired
	PersonAddressService personAddressService;
	
	
	
	@GetMapping("/allPersons")
	private List<Person> getAllPersons() 
	{
		return personService.getAllPersons();
	}
	
	@GetMapping("/personsCount")
	private int getPersonsCount() 
	{	
		List<Person> persons=personService.getAllPersons();
		return persons.size();
	}
	
	@PostMapping("/savePerson")
	private int savePerson(@RequestBody Person person) 
	{
		personService.saveOrUpdate(person);
		return person.getPersonId();
	}
	
	@DeleteMapping("/deletePerson/{personId}")
	private void deletePerson(@PathVariable("personId") int personId) 
	{
		personService.delete(personId);
	}
	
	//Address 
	
	@GetMapping("/AllpersonAddress")
	private List<PersonAddress> getAllPersonsAddress() 
	{
		return personAddressService.getAllPersonsAddress();
	}
	
	@PostMapping("/savePersonAddress")
	private int savePerson(@RequestBody PersonAddress personAddress) 
	{
		personAddressService.saveOrUpdate(personAddress);
		return personAddress.getAddressId();
	}
	
	@DeleteMapping("/deletePersonAddress/{addressId}/{personId}")
	private void deletePersonAddress(@PathVariable("addressId") int id,@PathVariable("personId") int personId) 
	{
		personAddressService.delete(id, personId);
	}
	
	
}
