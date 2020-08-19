/**
 * 
 */
package com.delivery.FDMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delivery.FDMS.entity.CustomerOrder;

/**
 * @author Ashwani
 *
 */
@Repository
public interface OrderRepository extends JpaRepository<CustomerOrder, Integer> {

}