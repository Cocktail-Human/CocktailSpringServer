package com.springserver.cocktailspringserver.data.dao.impl;

import com.springserver.cocktailspringserver.data.dao.ActivityDAO;
import com.springserver.cocktailspringserver.domain.activity.Activity;
import com.springserver.cocktailspringserver.domain.activity.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ActivityDAOImpl implements ActivityDAO {

    private final ActivityRepository activityRepository;

    @Autowired
    public ActivityDAOImpl(ActivityRepository activityRepository){
        this.activityRepository = activityRepository;
    }

    @Override
    public Activity insertActivity(Activity activity) {
        activityRepository.save(activity);
        return activityRepository.findById(activity.getId()).get();
    }

    @Override
    public Activity selectActivityById(Integer id) {
        return activityRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 활동이 없습니다. id=" + id));
    }

    @Override
    public Activity updateActivityName(Integer id, String name) {
        return null;
    }

    @Override
    public Activity updateActivityDescription(Integer id, String description) {
        return null;
    }

    @Override
    public Activity deleteActivity(Integer id) {
        return null;
    }
}

