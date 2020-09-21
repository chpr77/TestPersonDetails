package com.javatpoint.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.javatpoint.model.PersonAddress;
public interface PersonAddressRepository extends CrudRepository<PersonAddress, Integer>
{
	@Query("select p from PersonAddress p where p.addressId = :addressId and p.personId = :personId")
	  PersonAddress findByAddressIdAndPersonId(@Param("addressId") int addressId,
	                                 @Param("personId") int personId);
	@Query("delete  from PersonAddress p where p.addressId = :addressId and p.personId = :personId")
	  void deleteAddress(@Param("addressId") int addressId,
	                                 @Param("personId") int personId);
}