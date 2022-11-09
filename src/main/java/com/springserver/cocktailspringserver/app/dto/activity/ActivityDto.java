package com.springserver.cocktailspringserver.app.dto.activity;

import com.springserver.cocktailspringserver.domain.activity.Activity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link Activity} entity
 */

@Getter
@NoArgsConstructor
public class ActivityDto implements Serializable {
    private Integer id;
    private String title;
    private String description;
    private String startTime;
    private String endTime;
    private String image;
    public ActivityDto(Activity entity) {
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