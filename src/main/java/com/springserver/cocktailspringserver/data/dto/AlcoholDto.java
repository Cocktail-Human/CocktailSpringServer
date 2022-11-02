package com.springserver.cocktailspringserver.data.dto;

import com.springserver.cocktailspringserver.data.entity.Alcohol;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Alcohol} entity
 */
@Data
public class AlcoholDto implements Serializable {
    private final Integer id;
    private final String title;
    private final String kind;
    private final Integer degree;
    private final String image;
    private final Integer capacity;
}