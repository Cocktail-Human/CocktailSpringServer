package com.springserver.cocktailspringserver.domain.alcohol;

import com.springserver.cocktailspringserver.domain.activity.Activity;
import com.springserver.cocktailspringserver.domain.alcohol.Alcohol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlcoholRepository extends JpaRepository<Alcohol, Integer> {
    @Query("SELECT a FROM Alcohol a ORDER BY a.id DESC")
    List<Alcohol> findAllDesc();
}