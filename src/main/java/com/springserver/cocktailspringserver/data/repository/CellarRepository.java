package com.springserver.cocktailspringserver.data.repository;

import com.springserver.cocktailspringserver.data.entity.Cellar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CellarRepository extends JpaRepository<Cellar, Integer> {
}