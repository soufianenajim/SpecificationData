package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.demo.model.Customer;

public interface CustomerService {

	public Page<Customer> findByLastname(String lastname, Pageable pageable);
	public List<Customer> findByLastname(String lastname,Sort sort);
	public List<Customer> findById(Long id );
	public void save();
}
