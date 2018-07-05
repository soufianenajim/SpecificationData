package com.example.demo.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.example.demo.model.Account;
import com.example.demo.model.Account_;

public class AccountSpecification {
	
	public static Specification<Account> idEqual(Long id){
		
		return (Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> cb.equal(root.get(Account_.id), id);
		
	}

}
