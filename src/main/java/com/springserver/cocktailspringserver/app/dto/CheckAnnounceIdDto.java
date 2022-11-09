package com.springserver.cocktailspringserver.app.dto;

import com.springserver.cocktailspringserver.domain.checkAnnounce.CheckAnnounceId;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link CheckAnnounceId} entity
 */
@Data
public class CheckAnnounceIdDto implements Serializable {
    private final Integer userId;
    private final Integer announceId;
}