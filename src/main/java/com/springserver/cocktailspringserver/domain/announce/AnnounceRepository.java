package com.springserver.cocktailspringserver.domain.announce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnnounceRepository extends JpaRepository<Announce, Integer> {

    @Query("SELECT a FROM Announce a ORDER BY a.id DESC")
    List<Announce> findAllDesc();
}