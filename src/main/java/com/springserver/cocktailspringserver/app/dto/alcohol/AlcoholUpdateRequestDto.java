package com.springserver.cocktailspringserver.app.dto.alcohol;

import com.springserver.cocktailspringserver.domain.alcohol.Alcohol;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

/**
 * A DTO for the {@link Alcohol} entity
 */

@Getter
public class AlcoholUpdateRequestDto implements Serializable {
    private final String title;
    private final String kind;
    private final Integer degree;
    private final String image;
    private final Integer capacity;

    @Builder
    public AlcoholUpdateRequestDto(String title, String kind, Integer degree, String image, Integer capacity) {
        this.title = title;
        this.kind = kind;
        this.degree = degree;
        this.image = image;
        this.capacity = capacity;
    }
}