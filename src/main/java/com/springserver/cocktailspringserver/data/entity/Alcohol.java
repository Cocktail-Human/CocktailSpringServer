package com.springserver.cocktailspringserver.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Alcohol {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = 30)
    private String title;

    @Column(name = "kind", nullable = false, length = 20)
    private String kind;

    @Column(name = "degree")
    private Integer degree;

    @Column(name = "image", nullable = false, length = 3000)
    private String image;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ")";
    }
}