package com.example.demo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;
import com.example.demo.model.Customer;

@Repository
@org.springframework.transaction.annotation.Transactional(readOnly=true)
public class AccountServiceImpl implements AccountService {

	 @PersistenceContext
	private EntityManager em;
	
	@Override
	public Account save(Account account) {
		em.persist(account);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> findByCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
