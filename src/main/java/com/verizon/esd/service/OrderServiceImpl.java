package com.verizon.esd.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.esd.dao.OrderRepository;

import com.verizon.esd.model.Order;


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepo;

	@Override
	public Order addOrder(Order order) {
		
		if (!orderRepo.existsById(order.getOrderId())) {
			return orderRepo.save(order);
		} else
			return null;
		
	}

	@Override
	public boolean deleteOrder(long orderId) {
		boolean isDeleted = false;
		if (orderRepo.existsById(orderId)) {
			orderRepo.deleteById(orderId);
			isDeleted = true;
		}
		return isDeleted;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}

	
	
	

}
