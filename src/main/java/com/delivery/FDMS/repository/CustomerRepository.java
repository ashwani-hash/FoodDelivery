/**
 * 
 */
package com.delivery.FDMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delivery.FDMS.entity.Customer;

/**
 * @author Ashwani
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
