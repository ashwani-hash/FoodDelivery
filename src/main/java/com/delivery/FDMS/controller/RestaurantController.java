/**
 * 
 */
package com.delivery.FDMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.FDMS.entity.Restaurant;
import com.delivery.FDMS.repository.RestaurantRepository;

/**
 * @author Ashwani
 *
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class RestaurantController {
	@Autowired
	private RestaurantRepository restaurantRepository;

	@RequestMapping("/restaurants")
	public List<Restaurant> getRestaurants() {
		return restaurantRepository.findAll();
	}

	@PostMapping("/add-restaurant")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
		return	restaurantRepository.save(restaurant);
	//	return "Restaurant " + restaurant.getName() + " added.";
	}

	@DeleteMapping("delete-restaurant/{id}")
	public void delete(@PathVariable("id") int id) {
		restaurantRepository.deleteById(id);
	}

}