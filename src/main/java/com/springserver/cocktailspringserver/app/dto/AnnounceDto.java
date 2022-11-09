package com.springserver.cocktailspringserver.app.dto;

import com.springserver.cocktailspringserver.domain.announce.Announce;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Announce} entity
 */
@Data
public class AnnounceDto implements Serializable {
    private final Integer id;
    private final String title;
    private final String kind;
    private final String description;
    private final String image;
}