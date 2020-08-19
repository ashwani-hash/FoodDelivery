/**
 * 
 */
package com.delivery.FDMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delivery.FDMS.entity.Restaurant;

/**
 * @author Ashwani
 *
 */
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
