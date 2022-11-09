package com.springserver.cocktailspringserver.domain.checkAnnounce;

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
public class CheckAnnounceId implements Serializable {
    private static final long serialVersionUID = 5610643979955469337L;
    @Column(name = "User_id", nullable = false)
    private Integer userId;

    @Column(name = "Announce_id", nullable = false)
    private Integer announceId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CheckAnnounceId entity = (CheckAnnounceId) o;
        return Objects.equals(this.announceId, entity.announceId) &&
                Objects.equals(this.userId, entity.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(announceId, userId);
    }

}