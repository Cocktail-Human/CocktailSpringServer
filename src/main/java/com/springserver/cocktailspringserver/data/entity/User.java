package com.springserver.cocktailspringserver.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {
    @Id
    @Column(name = "student_id", nullable = false)
    private Integer id;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "rate", length = 3)
    private String rate;

    @Column(name = "announce_permission")
    private Character announcePermission;

    @Column(name = "actPosting_permission")
    private Character actpostingPermission;

    @Column(name = "store_permission")
    private Character storePermission;

    @Column(name = "notification_permission")
    private Character notificationPermission;

}