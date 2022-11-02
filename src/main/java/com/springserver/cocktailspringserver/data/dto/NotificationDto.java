package com.springserver.cocktailspringserver.data.dto;

import com.springserver.cocktailspringserver.data.entity.Notification;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Notification} entity
 */
@Data
public class NotificationDto implements Serializable {
    private final Integer id;
    private final String title;
    private final String description;
    private final String image;
}