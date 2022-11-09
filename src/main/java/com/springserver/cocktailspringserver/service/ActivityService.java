package com.springserver.cocktailspringserver.service;

import com.springserver.cocktailspringserver.app.dto.activity.*;
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
    public ActivitySaveRequestDto save(ActivitySaveRequestDto requestDto){
        //Entity 저장 후, 받아와
        Activity activity = activityRepository.save(requestDto.toEntity());
        //Dto로 변환후 return
        return new ActivitySaveRequestDto(activity);
    }

    @Transactional
    public Integer update(Integer id, ActivityUpdateRequestDto requestDto){
        Activity activity = activityRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 활동이 없습니다. id=" + id));

        activity.update(
                requestDto.getTitle(),
                requestDto.getDescription(),
                requestDto.getStartTime(),
                requestDto.getEndTime()
        );

        //id 반환, 혹은 객체 반환
        return activity.getId();
    }

    //commit&push test
//    @Transactional
//    public Integer updateImageURL(Integer id, ActivityDto activityDto){
//        Activity activity = activityRepository.findById(id)
//                .orElseThrow(()->new IllegalArgumentException("해당 활동이 없습니다. id=" + id));
//
//        activity.updateImageURL(activityDto.getImage());
//
//        //id 반환, 혹은 객체 반환
//        return id;
//    }

    @Transactional
    public void delete(Integer id){
        Activity activity = activityRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 활동이 없습니다. id=" + id));

        activityRepository.delete(activity);
    }

    public ActivityResponseDto findById(Integer id){
        Activity entity = activityRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 활동이 없습니다. id="+id));

        return new ActivityResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<ActivityListResponseDto> findAllDesc(){
        return activityRepository.findAllDesc().stream()
                .map(ActivityListResponseDto::new)
                .collect(Collectors.toList());
    }


}
