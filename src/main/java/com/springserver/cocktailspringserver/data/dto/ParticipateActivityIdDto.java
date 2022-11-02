package com.springserver.cocktailspringserver.data.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.springserver.cocktailspringserver.data.entity.ParticipateActivityId} entity
 */
public class ParticipateActivityIdDto implements Serializable {
    private final Integer userId;
    private final Integer activityId;

    public ParticipateActivityIdDto(Integer userId, Integer activityId) {
        this.userId = userId;
        this.activityId = activityId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ParticipateActivityIdDto)) return false;
        final ParticipateActivityIdDto other = (ParticipateActivityIdDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$activityId = this.getActivityId();
        final Object other$activityId = other.getActivityId();
        if (this$activityId == null ? other$activityId != null : !this$activityId.equals(other$activityId))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ParticipateActivityIdDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $activityId = this.getActivityId();
        result = result * PRIME + ($activityId == null ? 43 : $activityId.hashCode());
        return result;
    }

    public String toString() {
        return "ParticipateActivityIdDto(userId=" + this.getUserId() + ", activityId=" + this.getActivityId() + ")";
    }
}