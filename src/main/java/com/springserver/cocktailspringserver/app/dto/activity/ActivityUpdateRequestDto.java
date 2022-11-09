package com.springserver.cocktailspringserver.app.dto.activity;

import com.springserver.cocktailspringserver.domain.activity.Activity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link Activity} entity
 */

@Getter
public class ActivityUpdateRequestDto implements Serializable {
    private final String title;
    private final String description;
    private final String startTime;
    private final String endTime;
    private final String image;

    @Builder
    public ActivityUpdateRequestDto(String title, String description, String startTime, String endTime, String image) {
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.image = image;
    }
}