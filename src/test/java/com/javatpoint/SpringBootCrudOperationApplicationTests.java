package com.javatpoint;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import com.javatpoint.model.Person;
import com.javatpoint.model.PersonAddress;
import com.javatpoint.repository.PersonAddressRepository;
import com.javatpoint.repository.PersonRepository;

@SpringBootTest
class SpringBootCrudOperationApplicationTests {

	@Autowired
    private TestEntityManager entityManager;
	 	@Autowired
	    private PersonRepository repository;
	 	
	 	@Autowired
	    private PersonAddressRepository addressRepository;
	     
	 	//Saving Person
	    @Test
	    public void testSaveNewPerson() {
	        entityManager.persistAndFlush(new Person(20,"Manohar", "G"));
	                 
	        Optional<Person> person = repository.findById(20);
	         
	        assertThat(person.get().getFirstName()).isEqualTo("Manohar");
	    }
	    
	    //Deleting Person
	    @Test
	    public void testDeletePerson() {
	        entityManager.persistAndFlush(new Person(30,"Paramesh", "Ch"));
	                 
	        Optional<Person> person = repository.findById(30);
	        repository.delete(person.get());
	        boolean exists = repository.existsById(30);	       
	        assertThat(!exists);
	    }
	    
	  //Saving Person
	    @Test
	    public void testSaveAddressPerson() {
	    	entityManager.persistAndFlush(new Person(10,"Paramesh", "Ch"));
	        entityManager.persistAndFlush(new PersonAddress(20,10,"Telangana", "hyd","Kukatpally","200000"));
	                 
	         PersonAddress personAddress = addressRepository.findByAddressIdAndPersonId(20, 10);
	         
	        assertThat(personAddress.getAddressId()).isEqualTo(20);
	    }
	    
	    //Deleting Person
	    @Test
	    public void testDeletePersonAddress() {
	    	entityManager.persistAndFlush(new Person(10,"Paramesh", "Ch"));
	        entityManager.persistAndFlush(new PersonAddress(20,10,"Telangana", "hyd","Kukatpally","200000"));

	        addressRepository.deleteAddress(20, 10);;
	        PersonAddress personAddress = addressRepository.findByAddressIdAndPersonId(20, 10);	    
	        if(personAddress==null) {
	        	 assertThat(true);
	        }
	       
	    }

}
