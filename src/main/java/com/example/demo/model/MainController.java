package com.example.demo.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CustomerService;

@RestController
@Transactional
public class MainController {

	 @PersistenceContext
		private EntityManager em;
	 
	 @Autowired 
	 private CustomerService customerService; 
	 
	 
	 @RequestMapping("/save")

	 public String save(){
      	customerService.save();
		 return "saved";
		 
	 }
	 
	 
	 @RequestMapping("/merge")
	 public String merge(){
		 Customer c=new Customer(1L,"test1", "test33");
		 em.merge(c);
		 return "merged";
		 
	 }
	 @RequestMapping("/find")
	 public List<Customer>  find(){
//		Page<Customer> costumers= customerService.findByLastname("test", PageRequest.of(0, 5));
//		return costumers.getContent();
		 return customerService.findByLastname("test",Sort.by(Direction.DESC, "id"));
		 
	 }
	 @RequestMapping("/find1")
	 public List<Customer>  find1(){
		Page<Customer> costumers= customerService.findByLastname("test", PageRequest.of(1,10));
		return costumers.getContent();
		 
		 
	 }
	 @RequestMapping("/findId")
	 public List<Customer>  findbyId(){
		return customerService.findById(2L);
		 
		 
	 }
}
