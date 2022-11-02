package com.springserver.cocktailspringserver.data.repository;

import com.springserver.cocktailspringserver.data.entity.Announce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnounceRepository extends JpaRepository<Announce, Integer> {
}