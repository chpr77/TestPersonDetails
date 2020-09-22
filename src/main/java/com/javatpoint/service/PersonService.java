package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.model.Person;
import com.javatpoint.repository.PersonRepository;
//defining the business logic
@Service
public class PersonService 
{
	@Autowired
	PersonRepository personRepository;
	//getting all books record by using the method findaAll() of CrudRepository
	public List<Person> getAllPersons() 
	{
		List<Person> persons = new ArrayList<Person>();
		personRepository.findAll().forEach(pers1 -> persons.add(pers1));
		return persons;
	}
	//getting a specific record by using the method findById() of CrudRepository
	public Person getPersonById(int id) 
	{
		return personRepository.findById(id).get();
	}
	//saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Person person) 
	{
		personRepository.save(person);
	}
	//deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) 
	{
		personRepository.deleteById(id);
	}
	//updating a record
	public void update(Person person, int personId) 
	{
		personRepository.save(person);
	}
}