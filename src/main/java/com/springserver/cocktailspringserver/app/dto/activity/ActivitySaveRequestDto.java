package com.springserver.cocktailspringserver.app.dto.activity;

import com.springserver.cocktailspringserver.domain.activity.Activity;
import lombok.Getter;

import java.io.Serializable;

/**
 * A DTO for the {@link Activity} entity
 */

@Getter
public class ActivitySaveRequestDto implements Serializable {
    private final Integer id;
    private final String title;
    private final String description;
    private final String startTime;
    private final String endTime;
    private final String image;

    public ActivitySaveRequestDto(Activity entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.description = entity.getDescription();
        this.startTime = entity.getStartTime();
        this.endTime = entity.getEndTime();
        this.image = entity.getImageURL();
    }

    public Activity toEntity(){
        return Activity.builder()
                .id(id)
                .title(title)
                .description(description)
                .startTime(startTime)
                .endTime(endTime)
                .imageURL(image)
                .build();
    }

}