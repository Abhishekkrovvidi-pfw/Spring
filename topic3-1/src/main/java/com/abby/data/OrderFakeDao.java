package com.abby.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.abby.models.OrderModel;
@Repository
public class OrderFakeDao  implements OrderDataAccessInterface{
	
	
	List<OrderModel> orders = new ArrayList<OrderModel>();
	public OrderFakeDao() {
		orders.add(new OrderModel(0L,"000" , "Monitor" , 250.12f ,2));
		orders.add(new OrderModel(1L,"001" , "Graphiccard" , 600.1f ,2));
		orders.add(new OrderModel(2L,"002" , "Laptop" , 1200.12f ,1));
		orders.add(new OrderModel(3L,"003" , "Chair" , 50.12f ,2));
		orders.add(new OrderModel(4L,"004" , "KeyBoard" , 40.11f ,2));
		orders.add(new OrderModel(5L,"005" , "Mouse" , 150.12f ,1));
	}

	@Override
	public OrderModel getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<OrderModel> getOrders() {
		
		return orders;
	}

	@Override
	public List<OrderModel> searchOrders(String searchTerm) {
//		List<OrderModel> foundItems  = new ArrayList<OrderModel>();
//		for(int i = 0 ; i<orders.size(); i++) {
//			if(orders.get(i).getProductName().toLowerCase().contains(searchTerm)) {
//				foundItems.add(orders.get(i));
//			}
//		}
//		return foundItems;
		List<OrderModel> foundItems = orders
				.stream()
				.filter(order -> order.getProductName().toLowerCase().contains(searchTerm.toLowerCase()))
				.collect(Collectors.toList());
		return foundItems;
	}

	@Override
	public long addOne(OrderModel newOrder) {
		boolean success = orders.add(newOrder);
		if(success) {
			return  1;
		}
		else {
			return  0;
		}
	}

	@Override
	public boolean deleteOne(long id) {
		for(int i = 0 ; i<orders.size(); i++) {
			if(orders.get(i).getId()== id ){
			orders.remove(i);
			return true;
		}		
	}//if nothing is found
		return false;
		
	}

	@Override
	public OrderModel updateOne(long idToUpdate, OrderModel updateOrder) {
		// TODO Auto-generated method stub
		return null;
	}

}
