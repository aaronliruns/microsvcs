package com.aaronliruns.microservices.demo.repository;

import java.util.List;

import com.aaronliruns.microservices.demo.entity.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;


public interface AccountRepository extends Repository<Account, Long> {


	/*
	The query builder mechanism built into Spring Data repository infrastructure is useful for
	building constraining queries over entities of the repository.
	The mechanism strips the prefixes find…By, read…By, and get…By from the method and starts parsing the rest of it.
	 */

	public Account findByNumber(String accountNumber);


	public List<Account> findByOwnerContainingIgnoreCase(String partialName);

	/*
	bind them directly using the Spring Data JPA @Query annotation rather than annotating them to the domain class.
	This will free the domain class from persistence specific information and co-locate the query to the repository interface.
	*/

	@Query("SELECT count(*) from Account")
	public int countAccounts();
}
