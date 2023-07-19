package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
// anotation que registra a classe como componente do spring para poder ser injetado altomaticamente 
// pelo autowired da classe UserResource

@Service
public class UserService {
// operacao na camada de servico que repassa a operacao para o repository.findAll
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id ) {
		Optional<User> obj = repository.findById(id);
		return obj.get();	}
}
