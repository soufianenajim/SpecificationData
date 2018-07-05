package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.CustomerSpecification;
import com.example.demo.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Page<Customer> findByLastname(String lastname, Pageable pageable) {
		
		return customerRepository.findByLastname(lastname, pageable);
	}

	@Override
	public List<Customer> findByLastname(String lastname,Sort sort) {
		// TODO Auto-generated method stub
		return customerRepository.findByLastname(lastname,sort);
	}
	public List<Customer> findById(Long id ){
		return customerRepository.findAll(Specification.where(CustomerSpecification.firstnameEqual("test").and(CustomerSpecification.lastnameEqual("test"))));
	}
	public void save(){
		for (int i = 0; i < 10; i++) {
			customerRepository.save(new Customer("test", "test"));
		}
		for (int i = 0; i < 10; i++) {
			customerRepository.save(new Customer("test", "test1"));
		}
		for (int i = 0; i < 10; i++) {
			customerRepository.save(new Customer("test2", "test1"));
		}
		for (int i = 0; i < 10; i++) {
			customerRepository.save(new Customer("test1", "test1"));
		}
		
	}
	
}
