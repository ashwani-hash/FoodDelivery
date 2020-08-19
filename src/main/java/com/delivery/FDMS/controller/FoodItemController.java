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

import com.delivery.FDMS.entity.FoodItem;
import com.delivery.FDMS.repository.FoodItemRepository;

/**
 * @author Ashwani
 *
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class FoodItemController {

	@Autowired
	private FoodItemRepository foodItemRepository;

	@GetMapping("/items")
	public List<FoodItem> getFoodItems() {
		return foodItemRepository.findAll();
	}

	@PostMapping("/add-item")
	public String addItem(@RequestBody FoodItem foodItem) {
		foodItemRepository.save(foodItem);
		return "Item" + foodItem.getItem() + " added";
	}
}