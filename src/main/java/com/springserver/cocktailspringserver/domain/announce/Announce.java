package com.springserver.cocktailspringserver.domain.announce;

import com.springserver.cocktailspringserver.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Announce extends BaseTimeEntity {
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

    public void update(String title, String kind, String description, String image){
        this.title = title;
        this.kind = kind;
        this.description = description;
        this.image = image;
    }
}