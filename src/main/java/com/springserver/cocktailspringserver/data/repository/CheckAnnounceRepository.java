package com.springserver.cocktailspringserver.data.repository;

import com.springserver.cocktailspringserver.data.entity.CheckAnnounce;
import com.springserver.cocktailspringserver.data.entity.CheckAnnounceId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckAnnounceRepository extends JpaRepository<CheckAnnounce, CheckAnnounceId> {
}