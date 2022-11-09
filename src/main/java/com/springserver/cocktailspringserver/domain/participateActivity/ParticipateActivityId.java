package com.springserver.cocktailspringserver.domain.participateActivity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class ParticipateActivityId implements Serializable {
    private static final long serialVersionUID = 2818470451752030871L;
    @Column(name = "User_id", nullable = false)
    private Integer userId;

    @Column(name = "Activity_id", nullable = false)
    private Integer activityId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ParticipateActivityId entity = (ParticipateActivityId) o;
        return Objects.equals(this.activityId, entity.activityId) &&
                Objects.equals(this.userId, entity.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activityId, userId);
    }

}