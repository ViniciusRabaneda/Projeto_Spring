package com.projetoSpring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoSpring.course.entities.Order;
import com.projetoSpring.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
		
	}
	
	public Order findById(Long Id) {
		Optional<Order> obj =  repository.findById(Id);
		return obj.get(); // Foi necessário utilizar o get pois estamos usando o Optional, se não utilizassemos e o valor voltasse null daria problema
	}
	
}
