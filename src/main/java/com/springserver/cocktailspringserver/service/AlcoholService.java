package com.springserver.cocktailspringserver.service;

import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholListResponseDto;
import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholResponseDto;
import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholSaveRequestDto;
import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholUpdateRequestDto;
import com.springserver.cocktailspringserver.domain.alcohol.Alcohol;
import com.springserver.cocktailspringserver.domain.alcohol.AlcoholRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AlcoholService {

    private final AlcoholRepository repository;

    @Transactional
    public AlcoholSaveRequestDto save(AlcoholSaveRequestDto requestDto){
        //Entity 저장 후, 받아와
        Alcohol entity = repository.save(requestDto.toEntity());
        //Dto로 변환후 return
        return new AlcoholSaveRequestDto(entity);
    }

    @Transactional
    public Integer update(Integer id, AlcoholUpdateRequestDto requestDto){
        Alcohol entity = repository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 주류가 없습니다. id=" + id));

        entity.update(
                requestDto.getTitle(),
                requestDto.getKind(),
                requestDto.getDegree(),
                requestDto.getImage(),
                requestDto.getCapacity()
        );

        //id 반환, 혹은 객체 반환
        return entity.getId();
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
        Alcohol entity = repository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 주류가 없습니다. id=" + id));

        repository.delete(entity);
    }

    public AlcoholResponseDto findById(Integer id){
        Alcohol entity = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 주류가 없습니다. id="+id));

        return new AlcoholResponseDto(entity) ;
    }

    @Transactional(readOnly = true)
    public List<AlcoholListResponseDto> findAllDesc(){
        return repository.findAllDesc().stream()
                .map(AlcoholListResponseDto::new)
                .collect(Collectors.toList());
    }


}
