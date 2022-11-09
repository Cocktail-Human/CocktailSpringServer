package com.springserver.cocktailspringserver.app.dto.activity;

import com.springserver.cocktailspringserver.domain.activity.Activity;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

/**
 * A DTO for the {@link Activity} entity
 */

@Getter
public class ActivityListResponseDto implements Serializable {

    private final Integer id;
    private final String title;
    private final String startTime;
    private final String endTime;

    public ActivityListResponseDto(Activity entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.startTime = entity.getStartTime();
        this.endTime = entity.getEndTime();
    }
}