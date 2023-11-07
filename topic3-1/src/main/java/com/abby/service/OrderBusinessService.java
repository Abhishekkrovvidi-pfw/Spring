package com.abby.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.abby.data.OrderDataAccessInterface;
import com.abby.models.OrderModel;
public class OrderBusinessService implements OrderBusinessServiceInterface{
	@Autowired
	OrderDataAccessInterface ordersDAO;
	@Override
	public void test() {
		System.out.println("OrderBusinessService is working");
		
	}

	@Override
	public List<OrderModel> getOrders() {
		
		return ordersDAO.getOrders();
	}

	public void init() {
		System.out.println("nnanansa");
		
	}
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderModel getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderModel> searchOrders(String searchTerm) {
		
		return ordersDAO.searchOrders(searchTerm);
	}

	@Override
	public Long addOne(OrderModel newOrder) {
		return ordersDAO.addOne(newOrder);
	}

	@Override
	public boolean deleteOne(long id) {
		return ordersDAO.deleteOne(id);
	}

	@Override
	public OrderModel updateOne(long idToUpdate, OrderModel updateOrder) {
		// TODO Auto-generated method stub
		return null;
	}


}
