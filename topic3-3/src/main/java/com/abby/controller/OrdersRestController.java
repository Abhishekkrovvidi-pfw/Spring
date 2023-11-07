package com.abby.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abby.models.OrderModel;
import com.abby.services.OrdersBusinessServiceInterface;

@Controller
@RequestMapping("/orders")
public class OrdersRestController {
	//dependency injection
	OrdersBusinessServiceInterface service;
	
	@Autowired
	
}
	
