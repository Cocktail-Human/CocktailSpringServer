package com.springserver.cocktailspringserver.app.dto.annouce;

import com.springserver.cocktailspringserver.domain.announce.Announce;
import lombok.Getter;

import java.io.Serializable;

/**
 * A DTO for the {@link Announce} entity
 */

@Getter
public class AnnounceResponseDto implements Serializable {
    private Integer id;
    private String title;
    private String kind;
    private String description;
    private String image;

    public AnnounceResponseDto(Announce entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.kind = entity.getKind();
        this.description = entity.getDescription();
        this.image = entity.getImage();
    }

}