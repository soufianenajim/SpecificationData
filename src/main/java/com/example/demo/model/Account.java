package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Account {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;

	  @ManyToOne
	  private Customer customer;

	  @Temporal(TemporalType.DATE)
	  private Date expiryDate;

	  // … methods omitted
	}