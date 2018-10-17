package com.verizon.esd.service;





import java.util.List;

import com.verizon.esd.model.Employee;
import com.verizon.esd.model.Order;





public interface OrderService {
	
	Order addOrder(Order order);
	List<Order> getAllOrders();

	

	



	boolean deleteOrder(long orderId);

		

	}
