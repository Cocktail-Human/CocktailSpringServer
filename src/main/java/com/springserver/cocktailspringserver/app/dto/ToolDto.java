package com.springserver.cocktailspringserver.app.dto;

import com.springserver.cocktailspringserver.domain.tool.Tool;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Tool} entity
 */
@Data
public class ToolDto implements Serializable {
    private final Integer id;
    private final String name;
    private final String description;
    private final String image;
}