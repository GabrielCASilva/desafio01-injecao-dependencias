package com.aula.desafio01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.aula.desafio01.entities.Order;
import com.aula.desafio01.services.OrderService;

@SpringBootApplication
@ComponentScan({ "com.aula.desafio01" })
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 20.0);
		double total = orderService.total(order);
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + total + "\n");

		Order order2 = new Order(2282, 800.00, 10.0);
		double total2 = orderService.total(order2);
		System.out.println("Pedido código " + order2.getCode());
		System.out.println("Valor total: R$ " + total2 + "\n");

		Order order3 = new Order(1309, 95.90, 0.0);
		double total3 = orderService.total(order3);
		System.out.println("Pedido código " + order3.getCode());
		System.out.println("Valor total: R$ " + total3 + "\n");

	}

}
