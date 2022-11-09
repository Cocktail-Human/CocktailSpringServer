package com.springserver.cocktailspringserver.domain.alcohol;

import com.springserver.cocktailspringserver.domain.alcohol.Alcohol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlcoholRepository extends JpaRepository<Alcohol, Integer> {
}