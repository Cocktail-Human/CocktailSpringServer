package com.springserver.cocktailspringserver.app.dto.annouce;
import com.springserver.cocktailspringserver.domain.announce.Announce;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

/**
 * A DTO for the {@link Announce} entity
 */

@Getter
public class AnnounceUpdateRequestDto implements Serializable {
    private final String title;
    private final String kind;
    private final String description;
    private final String image;

    @Builder
    public AnnounceUpdateRequestDto(String title, String kind, String description, String image) {
        this.title = title;
        this.kind = kind;
        this.description = description;
        this.image = image;
    }
}