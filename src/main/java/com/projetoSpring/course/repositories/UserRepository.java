package com.projetoSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.course.entities.User;

// não precisa adicionar @Repository pois esta herdando da classe JpaRepository que já esta registrado como repository
public interface UserRepository extends JpaRepository<User, Long>{

}
