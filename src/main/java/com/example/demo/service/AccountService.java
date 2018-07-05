package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Account;
import com.example.demo.model.Customer;



public interface AccountService {

	/**
	 * Saves the given {@link Account}.
	 *
	 * @param account
	 * @return
	 */
	Account save(Account account);

	/**
	 * Returns all {@link Account}s of the given {@link Customer}.
	 *
	 * @param customer
	 * @return
	 */
	List<Account> findByCustomer(Customer customer);
	
}