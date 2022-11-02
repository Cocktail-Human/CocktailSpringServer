package com.springserver.cocktailspringserver.data.repository;

import com.springserver.cocktailspringserver.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}