package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;
// anotation que registra a classe como componente do spring para poder ser injetado altomaticamente 
// pelo autowired da classe OrderResource

@Service
public class OrderService {
// operacao na camada de servico que repassa a operacao para o repository.findAll
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id ) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();	}
}
