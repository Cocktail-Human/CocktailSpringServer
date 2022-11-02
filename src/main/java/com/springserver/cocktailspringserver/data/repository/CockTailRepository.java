package com.springserver.cocktailspringserver.data.repository;

import com.springserver.cocktailspringserver.data.entity.CockTail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CockTailRepository extends JpaRepository<CockTail, Integer> {
}