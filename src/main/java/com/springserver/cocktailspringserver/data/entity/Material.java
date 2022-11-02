package com.springserver.cocktailspringserver.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Material {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private CockTail cockTail;

    @Column(name = "title", nullable = false, length = 20)
    private String title;

    @Column(name = "kind", nullable = false, length = 20)
    private String kind;

}