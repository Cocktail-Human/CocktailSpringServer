package com.springserver.cocktailspringserver.app.dto;

import com.springserver.cocktailspringserver.domain.cocktail.CockTail;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link CockTail} entity
 */
@Data
public class CockTailDto implements Serializable {
    private final Integer id;
    private final String title;
    private final String description;
    private final String image;
    private final String base;
    private final Integer degree;
    private final String technique;
}