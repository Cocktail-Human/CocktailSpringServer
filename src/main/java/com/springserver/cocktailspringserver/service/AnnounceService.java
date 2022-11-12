package com.springserver.cocktailspringserver.service;

import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholListResponseDto;
import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholResponseDto;
import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholSaveRequestDto;
import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholUpdateRequestDto;
import com.springserver.cocktailspringserver.app.dto.annouce.AnnounceListResponseDto;
import com.springserver.cocktailspringserver.app.dto.annouce.AnnounceResponseDto;
import com.springserver.cocktailspringserver.app.dto.annouce.AnnounceSaveRequestDto;
import com.springserver.cocktailspringserver.app.dto.annouce.AnnounceUpdateRequestDto;
import com.springserver.cocktailspringserver.domain.alcohol.Alcohol;
import com.springserver.cocktailspringserver.domain.alcohol.AlcoholRepository;
import com.springserver.cocktailspringserver.domain.announce.Announce;
import com.springserver.cocktailspringserver.domain.announce.AnnounceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AnnounceService {

    private final AnnounceRepository repository;

    @Transactional
    public AnnounceSaveRequestDto save(AnnounceSaveRequestDto requestDto){
        //Entity 저장 후, 받아와
        Announce entity = repository.save(requestDto.toEntity());
        //Dto로 변환후 return
        return new AnnounceSaveRequestDto(entity);
    }

    @Transactional
    public Integer update(Integer id, AnnounceUpdateRequestDto requestDto){
        Announce entity = repository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 공지가 없습니다. id=" + id));

        entity.update(
                requestDto.getTitle(),
                requestDto.getKind(),
                requestDto.getDescription(),
                requestDto.getImage()
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
        Announce entity = repository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 공지가 없습니다. id=" + id));

        repository.delete(entity);
    }

    public AnnounceResponseDto findById(Integer id){
        Announce entity = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 공지가 없습니다. id="+id));

        return new AnnounceResponseDto(entity) ;
    }

    @Transactional(readOnly = true)
    public List<AnnounceListResponseDto> findAllDesc(){
        return repository.findAllDesc().stream()
                .map(AnnounceListResponseDto::new)
                .collect(Collectors.toList());
    }


}
