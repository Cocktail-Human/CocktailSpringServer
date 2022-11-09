package com.springserver.cocktailspringserver.domain.notification;

import com.springserver.cocktailspringserver.domain.notification.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}