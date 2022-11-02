package com.springserver.cocktailspringserver.data.repository;

import com.springserver.cocktailspringserver.data.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Integer> {
}