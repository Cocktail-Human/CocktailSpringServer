package com.springserver.cocktailspringserver.domain.cocktail;

import com.springserver.cocktailspringserver.domain.cocktail.CockTail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CockTailRepository extends JpaRepository<CockTail, Integer> {
}