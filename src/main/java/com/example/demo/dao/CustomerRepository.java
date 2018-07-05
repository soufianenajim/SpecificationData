package com.example.demo.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.demo.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> ,JpaSpecificationExecutor<Customer>{

	Page<Customer> findByLastname(String lastname, Pageable pageable); 
	List<Customer> findByLastname(String lastname,Sort sort);
}
