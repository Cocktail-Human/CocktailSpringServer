package com.springserver.cocktailspringserver.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Cellar {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "alcohol_id", nullable = false)
    private Alcohol alcohol;

    @Column(name = "owner", nullable = false, length = 20)
    private String owner;

    @Column(name = "total_capacity", nullable = false)
    private Integer totalCapacity;

    @Column(name = "current_capacity", nullable = false)
    private Integer currentCapacity;

}