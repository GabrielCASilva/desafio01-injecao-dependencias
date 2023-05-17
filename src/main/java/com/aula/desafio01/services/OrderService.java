package com.aula.desafio01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.desafio01.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;

	public double total(Order order) {
		double discount = order.getBasic() * order.getDiscount() / 100;
		double priceDiscounted = order.getBasic() - discount;
		return priceDiscounted + shippingService.shipment(order);
	}
}
