package com.springserver.cocktailspringserver.data.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.springserver.cocktailspringserver.data.entity.Material} entity
 */
@Data
public class MaterialDto implements Serializable {
    private final Integer id;
    private final String title;
    private final String kind;
}