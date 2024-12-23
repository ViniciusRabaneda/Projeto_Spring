package com.projetoSpring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoSpring.course.entities.User;
import com.projetoSpring.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
		
	}
	
	public User findById(Long Id) {
		Optional<User> obj =  repository.findById(Id);
		return obj.get(); // Foi necessário utilizar o get pois estamos usando o Optional, se não utilizassemos e o valor voltasse null daria problema
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
}
