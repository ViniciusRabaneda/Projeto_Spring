package com.projetoSpring.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoSpring.course.entities.Product;
import com.projetoSpring.course.services.ProductService;

@RestController
@RequestMapping(value = "/products") // indica o caminho raiz, ou seja, para realizar uma requisição será necessário passar /user
public class ProductResource {

	@Autowired
	private ProductService service;

	@GetMapping // por não termos passado o value, este codigo esta indicando que o caminho é o mesmo do Request Mapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") // {} notação usada para definir que esta parte do path é variável.EX: user/1
	public ResponseEntity<Product> findById(@PathVariable Long id){ // @PathVariable é necessário para declarar que o valor da url irá mudar constantemente
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
