package com.abby.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abby.models.OrderModel;
import com.abby.service.OrderBusinessServiceInterface;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	//dependency injection
	//OrderBusinessService service = new OrderBusinessService();
	
	OrderBusinessServiceInterface service;
	@Autowired
	public OrdersController(OrderBusinessServiceInterface service) {
		super();
		this.service = service;
	}

	@GetMapping("/")
	public String showAllOrders(Model model) {
	List<OrderModel> orders = service.getOrders();
	model.addAttribute("title" , "This is a list of items i wanna buy");
	model.addAttribute("orders",orders);
	return"orders.html";
	}
}
