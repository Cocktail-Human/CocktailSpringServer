package com.springserver.cocktailspringserver.data.repository;

import com.springserver.cocktailspringserver.data.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
}