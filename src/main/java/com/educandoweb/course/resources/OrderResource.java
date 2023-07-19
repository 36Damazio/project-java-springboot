package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	// cria uma dependencia para o service
	@Autowired
	private OrderService service;

	@GetMapping
	public ResponseEntity<List<Order>> findALL() {
		List<Order> list = service.findAll();

		return ResponseEntity.ok().body(list);

	}
	// anotation indica que a requsicao vai aceitar um id dentro da url
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
}
