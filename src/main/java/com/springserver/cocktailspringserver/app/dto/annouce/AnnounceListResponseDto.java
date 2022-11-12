package com.springserver.cocktailspringserver.app.dto.annouce;

import com.springserver.cocktailspringserver.domain.announce.Announce;
import lombok.Getter;

import java.io.Serializable;

/**
 * A DTO for the {@link Announce} entity
 */

@Getter
public class AnnounceListResponseDto implements Serializable {

    private final Integer id;
    private final String title;
    private final String kind;
    private final String description;
    private final String image;
    public AnnounceListResponseDto(Announce entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.kind = entity.getKind();
        this.description = entity.getDescription();
        this.image = entity.getImage();
    }
}