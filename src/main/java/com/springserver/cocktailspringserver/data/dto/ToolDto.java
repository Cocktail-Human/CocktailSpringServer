package com.springserver.cocktailspringserver.data.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.springserver.cocktailspringserver.data.entity.Tool} entity
 */
@Data
public class ToolDto implements Serializable {
    private final Integer id;
    private final String name;
    private final String description;
    private final String image;
}