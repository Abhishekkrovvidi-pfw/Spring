package com.abby.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abby.models.OrderModel;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@GetMapping("/")
	public String showAllOrders(Model model) {
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0L,"000" ,"Skydiving experoence" ,1500.01f , 1));
		orders.add(new OrderModel(1L,"001" ,"Skydiving experoence" ,500.02f , 4));
		orders.add(new OrderModel(2L,"002" ,"Cricket " ,1420.01f , 5));
		orders.add(new OrderModel(3L,"003" ,"Skydiving experoence" ,1500.01f , 1));
		orders.add(new OrderModel(4L,"004" ,"Skydiving experoence" ,1500.01f , 1));
		orders.add(new OrderModel(5L,"005" ,"Skydiving experoence" ,1500.01f , 1));
		orders.add(new OrderModel(6L,"006" ,"Skydiving experoence" ,1500.01f , 1));
		orders.add(new OrderModel(7L,"007" ,"Skydiving experoence" ,1500.01f , 1));
		model.addAttribute(	"orders" , orders);
		model.addAttribute("title","Here is a list ");
		return "orders.html";
	}
	}
	
