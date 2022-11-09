package com.springserver.cocktailspringserver.servies;

import com.springserver.cocktailspringserver.app.dto.ActivityDto;
import com.springserver.cocktailspringserver.app.dto.ActivityResponseDto;
import com.springserver.cocktailspringserver.domain.activity.Activity;
import com.springserver.cocktailspringserver.domain.activity.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ActivityService {

    private final ActivityRepository activityRepository;

    @Transactional
    public ActivityResponseDto save(ActivityDto activityDto){
        Integer id = activityRepository.save(activityDto.toEntity()).getId();
        Activity activity =  activityRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 활동이 없습니다. id=" + id));
        return new ActivityResponseDto(activity);
    }

    @Transactional
    public Integer update(Integer id, ActivityDto activityDto){
        Activity activity = activityRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 활동이 없습니다. id=" + id));

        activity.update(activity.getTitle(),activity.getDescription(),activity.getStartTime(),activity.getEndTime());

        //id 반환, 혹은 객체 반환
        return id;
    }

    @Transactional
    public Integer updateImageURL(Integer id, ActivityDto activityDto){
        Activity activity = activityRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 활동이 없습니다. id=" + id));

        activity.updateImageURL(activityDto.getImage());

        //id 반환, 혹은 객체 반환
        return id;
    }

    @Transactional
    public void delete(Integer id){
        Activity activity = activityRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 활동이 없습니다. id=" + id));

        activityRepository.delete(activity);
    }

    public ActivityDto findById(Integer id){
        Activity entity = activityRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 활동이 없습니다. id="+id));

        return new ActivityDto(entity);
    }

    @Transactional(readOnly = true)
    public List<ActivityDto> findAllDesc(){
        return activityRepository.findAllDesc().stream()
                .map(ActivityDto::new)
                .collect(Collectors.toList());
    }


}
