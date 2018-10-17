package com.verizon.esd.restapi;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.esd.model.Employee;
import com.verizon.esd.model.Order;

import com.verizon.esd.service.OrderService;


@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrderApi {

	@Autowired
	public OrderService service;

	@GetMapping
	public ResponseEntity<List<Order>> getAllOrders() {

		return new ResponseEntity<>(service.getAllOrders(), HttpStatus.OK);

	}
	
	@PostMapping
	public ResponseEntity<Order> addOrder(@RequestBody Order order) {
		ResponseEntity<Order> resp = null;

		
		if (resp == null) {
			Order o = service.addOrder(order);

			if (o == null) {
				resp = new ResponseEntity<Order>(HttpStatus.BAD_REQUEST);
			} else {
				resp = new ResponseEntity<Order>(o, HttpStatus.OK);
			}
		}
		return resp;

	}
	
	

}
