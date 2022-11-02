package com.springserver.cocktailspringserver.data.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.springserver.cocktailspringserver.data.entity.Cellar} entity
 */
@Data
public class CellarDto implements Serializable {
    private final Integer id;
    private final String owner;
    private final Integer totalCapacity;
    private final Integer currentCapacity;
}