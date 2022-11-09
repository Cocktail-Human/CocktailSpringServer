package com.springserver.cocktailspringserver.data.dao;

import com.springserver.cocktailspringserver.domain.activity.Activity;

public interface ActivityDAO {

    Activity insertActivity(Activity activity);
    Activity selectActivityById(Integer id);
    Activity updateActivityName(Integer id, String name);
    Activity updateActivityDescription(Integer id, String description);
    Activity deleteActivity(Integer id);


}
