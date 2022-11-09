package com.springserver.cocktailspringserver.domain.cocktail;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class CockTail {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = 20)
    private String title;

    @Column(name = "description", length = 300)
    private String description;

    @Column(name = "image", nullable = false, length = 3000)
    private String image;

    @Column(name = "base", nullable = false, length = 20)
    private String base;

    @Column(name = "degree")
    private Integer degree;

    @Column(name = "technique", nullable = false, length = 20)
    private String technique;

}