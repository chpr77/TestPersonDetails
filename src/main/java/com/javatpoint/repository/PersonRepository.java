package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;

import com.javatpoint.model.Person;
public interface PersonRepository extends CrudRepository<Person, Integer>
{
}