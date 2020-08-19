/**
 * 
 */
package com.delivery.FDMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.FDMS.entity.FoodItem;

/**
 * @author Ashwani
 *
 */
public interface FoodItemRepository extends JpaRepository<FoodItem, Integer> {

}
