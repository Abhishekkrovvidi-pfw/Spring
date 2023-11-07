package com.abby;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abby.service.OrderBusinessService;
import com.abby.service.OrderBusinessServiceInterface;

@Configuration
public class SpringConfig {
@Bean(name="OrderBusinessService" ,initMethod = "init" ,destroyMethod = "destroy")
	public OrderBusinessServiceInterface getOrderBusiness() {
	return new OrderBusinessService();
}
}