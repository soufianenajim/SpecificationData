package com.example.demo.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.example.demo.model.Customer;
import com.example.demo.model.Customer_;

public class CustomerSpecification {

	public static Specification<Customer> idEqual(Long id) {

		return (Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> cb
				.equal(root.get(Customer_.id), id);

	}

	public static Specification<Customer> lastnameEqual(String lastname) {

		return (Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> cb
				.equal(root.get(Customer_.lastname), lastname);

	}
	public static Specification<Customer> firstnameEqual(String firstname) {

		return (Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> cb
				.equal(root.get(Customer_.firstname), firstname);

	}

}
