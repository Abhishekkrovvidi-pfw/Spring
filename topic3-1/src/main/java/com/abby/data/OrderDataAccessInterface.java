package com.abby.data;

import java.util.List;

import com.abby.models.OrderModel;

public interface OrderDataAccessInterface {
	public  OrderModel getById(long id); 
	public List<OrderModel> getOrders();
	public List<OrderModel> searchOrders(String searchTerm);
	public long addOne(OrderModel newOrder);
	public boolean deleteOne(long id);
	public OrderModel updateOne(long idToUpdate , OrderModel updateOrder);
	
	
}
