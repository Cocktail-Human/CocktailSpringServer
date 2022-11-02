package com.springserver.cocktailspringserver.data.repository;

import com.springserver.cocktailspringserver.data.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}