package com.springserver.cocktailspringserver.app.dto.alcohol;

import com.springserver.cocktailspringserver.domain.alcohol.Alcohol;
import lombok.Getter;

import java.io.Serializable;

/**
 * A DTO for the {@link Alcohol} entity
 */

@Getter
public class AlcoholListResponseDto implements Serializable {

    private final Integer id;
    private final String title;
    private final String kind;
    private final Integer degree;
    private final Integer capacity;
    public AlcoholListResponseDto(Alcohol entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.kind = entity.getKind();
        this.degree = entity.getDegree();
        this.capacity = entity.getCapacity();
    }
}