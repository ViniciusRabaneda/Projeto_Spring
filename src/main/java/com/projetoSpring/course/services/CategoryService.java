package com.projetoSpring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoSpring.course.entities.Category;
import com.projetoSpring.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
		
	}
	
	public Category findById(Long Id) {
		Optional<Category> obj =  repository.findById(Id);
		return obj.get(); // Foi necessário utilizar o get pois estamos usando o Optional, se não utilizassemos e o valor voltasse null daria problema
	}
	
}
