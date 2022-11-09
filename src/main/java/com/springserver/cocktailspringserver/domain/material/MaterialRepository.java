package com.springserver.cocktailspringserver.domain.material;

import com.springserver.cocktailspringserver.domain.material.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Integer> {
}