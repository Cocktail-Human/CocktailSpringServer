package com.springserver.cocktailspringserver.app.dto;

import com.springserver.cocktailspringserver.domain.user.User;
import lombok.Builder;

import java.io.Serializable;

/**
 * A DTO for the {@link User} entity
 */
public class UserDto implements Serializable {
    private final Integer id;
    private final String password;
    private final String name;
    private final String rate;
    private final Character announcePermission;
    private final Character actpostingPermission;
    private final Character storePermission;
    private final Character notificationPermission;

    @Builder
    public UserDto(Integer id, String password, String name, String rate, Character announcePermission, Character actpostingPermission, Character storePermission, Character notificationPermission) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.rate = rate;
        this.announcePermission = announcePermission;
        this.actpostingPermission = actpostingPermission;
        this.storePermission = storePermission;
        this.notificationPermission = notificationPermission;
    }

    public Integer getId() {
        return this.id;
    }

    public String getPassword() {
        return this.password;
    }

    public String getName() {
        return this.name;
    }

    public String getRate() {
        return this.rate;
    }

    public Character getAnnouncePermission() {
        return this.announcePermission;
    }

    public Character getActpostingPermission() {
        return this.actpostingPermission;
    }

    public Character getStorePermission() {
        return this.storePermission;
    }

    public Character getNotificationPermission() {
        return this.notificationPermission;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserDto)) return false;
        final UserDto other = (UserDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$rate = this.getRate();
        final Object other$rate = other.getRate();
        if (this$rate == null ? other$rate != null : !this$rate.equals(other$rate)) return false;
        final Object this$announcePermission = this.getAnnouncePermission();
        final Object other$announcePermission = other.getAnnouncePermission();
        if (this$announcePermission == null ? other$announcePermission != null : !this$announcePermission.equals(other$announcePermission))
            return false;
        final Object this$actpostingPermission = this.getActpostingPermission();
        final Object other$actpostingPermission = other.getActpostingPermission();
        if (this$actpostingPermission == null ? other$actpostingPermission != null : !this$actpostingPermission.equals(other$actpostingPermission))
            return false;
        final Object this$storePermission = this.getStorePermission();
        final Object other$storePermission = other.getStorePermission();
        if (this$storePermission == null ? other$storePermission != null : !this$storePermission.equals(other$storePermission))
            return false;
        final Object this$notificationPermission = this.getNotificationPermission();
        final Object other$notificationPermission = other.getNotificationPermission();
        if (this$notificationPermission == null ? other$notificationPermission != null : !this$notificationPermission.equals(other$notificationPermission))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $rate = this.getRate();
        result = result * PRIME + ($rate == null ? 43 : $rate.hashCode());
        final Object $announcePermission = this.getAnnouncePermission();
        result = result * PRIME + ($announcePermission == null ? 43 : $announcePermission.hashCode());
        final Object $actpostingPermission = this.getActpostingPermission();
        result = result * PRIME + ($actpostingPermission == null ? 43 : $actpostingPermission.hashCode());
        final Object $storePermission = this.getStorePermission();
        result = result * PRIME + ($storePermission == null ? 43 : $storePermission.hashCode());
        final Object $notificationPermission = this.getNotificationPermission();
        result = result * PRIME + ($notificationPermission == null ? 43 : $notificationPermission.hashCode());
        return result;
    }

    public String toString() {
        return "UserDto(id=" + this.getId() + ", password=" + this.getPassword() + ", name=" + this.getName() + ", rate=" + this.getRate() + ", announcePermission=" + this.getAnnouncePermission() + ", actpostingPermission=" + this.getActpostingPermission() + ", storePermission=" + this.getStorePermission() + ", notificationPermission=" + this.getNotificationPermission() + ")";
    }

    public User toEntity(){
        return User.builder()
                .id(id)
                .password(password)
                .name(name)
                .rate(rate)
                .announcePermission(announcePermission)
                .storePermission(storePermission)
                .notificationPermission(notificationPermission)
                .build();
    }
}