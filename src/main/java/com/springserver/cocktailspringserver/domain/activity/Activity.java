package com.springserver.cocktailspringserver.domain.activity;

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
public class Activity extends BaseTimeEntity {
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
    private String imageURL;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ")";
    }

    public void update(String title, String description, String startTime, String endTime){
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void updateImageURL(String imageURL){
        this.imageURL = imageURL;
    }

}