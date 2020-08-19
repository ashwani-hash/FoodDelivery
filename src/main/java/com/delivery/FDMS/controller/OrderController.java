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

import com.delivery.FDMS.entity.CustomerOrder;
import com.delivery.FDMS.repository.OrderRepository;

/**
 * @author Ashwani
 *
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;

	@GetMapping("/orders")
	public List<CustomerOrder> getOrders() {
		return orderRepository.findAll();
	}

	@PostMapping("/create-order")
	public String createOrder(@RequestBody CustomerOrder customerOrder) {
		orderRepository.save(customerOrder);
		return "Order placed.";
	}
}