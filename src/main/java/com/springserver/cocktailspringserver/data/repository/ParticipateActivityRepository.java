package com.springserver.cocktailspringserver.data.repository;

import com.springserver.cocktailspringserver.data.entity.ParticipateActivity;
import com.springserver.cocktailspringserver.data.entity.ParticipateActivityId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipateActivityRepository extends JpaRepository<ParticipateActivity, ParticipateActivityId> {
}