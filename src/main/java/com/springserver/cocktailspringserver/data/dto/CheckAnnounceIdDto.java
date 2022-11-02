package com.springserver.cocktailspringserver.data.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.springserver.cocktailspringserver.data.entity.CheckAnnounceId} entity
 */
@Data
public class CheckAnnounceIdDto implements Serializable {
    private final Integer userId;
    private final Integer announceId;
}