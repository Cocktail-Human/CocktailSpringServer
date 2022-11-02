package com.springserver.cocktailspringserver.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Participate_Activity")
public class ParticipateActivity {
    @EmbeddedId
    private ParticipateActivityId id;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "User_id", nullable = false)
    private User user;

    @MapsId("activityId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Activity_id", nullable = false)
    private Activity activity;

}