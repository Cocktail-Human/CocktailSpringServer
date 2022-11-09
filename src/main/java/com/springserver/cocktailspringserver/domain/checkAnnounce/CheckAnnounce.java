package com.springserver.cocktailspringserver.domain.checkAnnounce;

import com.springserver.cocktailspringserver.domain.user.User;
import com.springserver.cocktailspringserver.domain.announce.Announce;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "Check_Announce")
public class CheckAnnounce {
    @EmbeddedId
    private CheckAnnounceId id;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "User_id", nullable = false)
    private User user;

    @MapsId("announceId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Announce_id", nullable = false)
    private Announce announce;

}