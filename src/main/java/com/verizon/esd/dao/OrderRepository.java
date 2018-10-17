package com.verizon.esd.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.verizon.esd.model.Order;




@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
