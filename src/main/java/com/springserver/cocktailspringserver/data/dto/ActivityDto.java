package com.springserver.cocktailspringserver.data.dto;

import com.springserver.cocktailspringserver.data.entity.Activity;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Activity} entity
 */
@Data
public class ActivityDto implements Serializable {
    private final Integer id;
    private final String title;
    private final String description;
    private final String startTime;
    private final String endTime;
    private final String image;
}