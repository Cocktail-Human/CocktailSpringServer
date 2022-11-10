package com.springserver.cocktailspringserver.app.dto.alcohol;
import com.springserver.cocktailspringserver.domain.alcohol.Alcohol;
import lombok.Getter;

import java.io.Serializable;

/**
 * A DTO for the {@link Alcohol} entity
 */

@Getter
public class AlcoholResponseDto implements Serializable {
    private Integer id;
    private String title;
    private String kind;
    private Integer degree;
    private String image;
    private Integer capacity;

    public AlcoholResponseDto(Alcohol entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.kind = entity.getKind();
        this.degree = entity.getDegree();
        this.image = entity.getImage();
        this.capacity = entity.getCapacity();
    }

}