package com.springserver.cocktailspringserver.app.dto;

import com.springserver.cocktailspringserver.domain.cellar.Cellar;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Cellar} entity
 */
@Data
public class CellarDto implements Serializable {
    private final Integer id;
    private final String owner;
    private final Integer totalCapacity;
    private final Integer currentCapacity;
}