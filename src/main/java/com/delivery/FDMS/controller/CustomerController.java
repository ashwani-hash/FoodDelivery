/**
 * 
 */
package com.delivery.FDMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.FDMS.entity.Customer;
import com.delivery.FDMS.repository.CustomerRepository;

/**
 * @author Ashwani
 *
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	@PostMapping("/add-customer")
	public String addCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);
		return customer.getName() + " added.";
	}
}
