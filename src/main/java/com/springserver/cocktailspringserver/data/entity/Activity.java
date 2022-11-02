package com.springserver.cocktailspringserver.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Activity {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", length = 20)
    private String title;

    @Column(name = "description", nullable = false, length = 500)
    private String description;

    @Column(name = "start_time", nullable = false, length = 20)
    private String startTime;

    @Column(name = "end_time", nullable = false, length = 20)
    private String endTime;

    @Column(name = "image", nullable = false, length = 3000)
    private String image;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ")";
    }
}