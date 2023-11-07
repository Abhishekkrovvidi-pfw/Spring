package com.abby.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abby.models.OrderModel;
import com.abby.service.OrderBusinessServiceInterface;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersRestController {
	//dependency injection
	OrderBusinessServiceInterface service;
	@Autowired
	public OrdersRestController(OrderBusinessServiceInterface service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public List<OrderModel> showAllOrders() {
		 List<OrderModel> orders = service.getOrders();
		 return orders;
	}
	
	@GetMapping("/search/{searchTerm}")
	public List<OrderModel> searchOrders(@PathVariable(name="searchTerm") String searchTerm) {
		 List<OrderModel> orders = service.searchOrders(searchTerm);
		 return orders;
	}
	@PostMapping("/")	
	public long addOrder(@RequestBody OrderModel Model) {
		return service.addOne(Model);
	}
	@GetMapping("/delete/{id}")
	public boolean deleteOne(@PathVariable(name = "id")long id) {
	return service.deleteOne(id);
	
}
}
