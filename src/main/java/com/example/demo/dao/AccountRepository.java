package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.demo.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>,JpaSpecificationExecutor<Account> {

}
