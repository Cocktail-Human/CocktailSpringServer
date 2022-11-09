package com.springserver.cocktailspringserver.domain.announce;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Announce {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = 20)
    private String title;

    @Column(name = "kind", nullable = false, length = 20)
    private String kind;

    @Column(name = "description", nullable = false, length = 500)
    private String description;

    @Column(name = "image", nullable = false, length = 3000)
    private String image;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ")";
    }
}