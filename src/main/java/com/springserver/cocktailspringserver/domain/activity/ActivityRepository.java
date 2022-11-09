package com.springserver.cocktailspringserver.domain.activity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
    @Query("SELECT a FROM Activity a ORDER BY a.id DESC")
    List<Activity> findAllDesc();


}