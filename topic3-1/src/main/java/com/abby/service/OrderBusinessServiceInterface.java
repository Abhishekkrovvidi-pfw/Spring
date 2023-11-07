package com.abby.service;
import java.util.List;

import com.abby.models.OrderModel;

public interface OrderBusinessServiceInterface {
	public void test();
	public void init();
	public void destroy();
	public  OrderModel getById(long id); 
	public List<OrderModel> getOrders();
	public List<OrderModel> searchOrders(String searchTerm);
	
	public Long addOne(OrderModel newOrder);
	
	public boolean deleteOne(long id);
	
	public OrderModel updateOne(long idToUpdate , OrderModel updateOrder);
	
}
