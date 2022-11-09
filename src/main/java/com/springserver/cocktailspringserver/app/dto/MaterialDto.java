package com.springserver.cocktailspringserver.app.dto;

import com.springserver.cocktailspringserver.domain.material.Material;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Material} entity
 */
@Data
public class MaterialDto implements Serializable {
    private final Integer id;
    private final String title;
    private final String kind;
}