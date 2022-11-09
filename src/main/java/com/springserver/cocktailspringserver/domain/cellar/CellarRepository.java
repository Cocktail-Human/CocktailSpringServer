package com.springserver.cocktailspringserver.domain.cellar;

import com.springserver.cocktailspringserver.domain.cellar.Cellar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CellarRepository extends JpaRepository<Cellar, Integer> {
}