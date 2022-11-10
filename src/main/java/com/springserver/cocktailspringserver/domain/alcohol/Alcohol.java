package com.springserver.cocktailspringserver.domain.alcohol;

import com.springserver.cocktailspringserver.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
public class Alcohol extends BaseTimeEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = 30)
    private String title;

    @Column(name = "kind", nullable = false, length = 20)
    private String kind;

    //proof 변경해야함
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
    public void update(String title, String kind, Integer degree, String image, Integer capacity){
        this.title = title;
        this.kind = kind;
        this.degree = degree;
        this.image = image;
        this.capacity = capacity;
    }

}