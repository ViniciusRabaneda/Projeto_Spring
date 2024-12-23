package com.projetoSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.course.entities.Order;

// não precisa adicionar @Repository pois esta herdando da classe JpaRepository que já esta registrado como repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
