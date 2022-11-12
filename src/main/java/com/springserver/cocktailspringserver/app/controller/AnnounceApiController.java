package com.springserver.cocktailspringserver.app.controller;

import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholListResponseDto;
import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholResponseDto;
import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholSaveRequestDto;
import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholUpdateRequestDto;
import com.springserver.cocktailspringserver.app.dto.annouce.AnnounceListResponseDto;
import com.springserver.cocktailspringserver.app.dto.annouce.AnnounceResponseDto;
import com.springserver.cocktailspringserver.app.dto.annouce.AnnounceSaveRequestDto;
import com.springserver.cocktailspringserver.app.dto.annouce.AnnounceUpdateRequestDto;
import com.springserver.cocktailspringserver.domain.announce.Announce;
import com.springserver.cocktailspringserver.service.AlcoholService;
import com.springserver.cocktailspringserver.service.AnnounceService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AnnounceApiController {

    private final AnnounceService service;

    @ApiImplicitParam(name = "requestDto", value = "저장할 공지")
    @ApiOperation(value = "공지 저장", notes = "공지를 저장한다.")
    @PostMapping("/api/v1/announce")
    public ResponseEntity<AnnounceSaveRequestDto> save(@RequestBody AnnounceSaveRequestDto requestDto){
        return ResponseEntity.status(HttpStatus.OK).body(service.save(requestDto));
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "공지 id"),
            @ApiImplicitParam(name = "requestDto", value = "업데이트할 공지")
    })
    @ApiOperation(value = "공지 업데이트",notes = "공지를 업데이트한다.")
    @PutMapping("/api/v1/announce/{id}")
    public ResponseEntity<Integer> update(@PathVariable Integer id, @RequestBody AnnounceUpdateRequestDto requestDto){
        return ResponseEntity.status(HttpStatus.OK).body(service.update(id,requestDto));
    }

    @ApiImplicitParam(name = "id", value = "공지 id")
    @ApiOperation(value = "공지 삭제",notes = "공지를 삭제한다.")
    @DeleteMapping("/api/v1/announce/{id}")
    public Integer delete(@PathVariable Integer id){
        service.delete(id);
        return id;
    }

    @GetMapping("/api/v1/announce/{id}")
    @ApiImplicitParam(name = "id", value = "공지 id")
    @ApiOperation(value = "공지 조회",notes = "공지를 조회한다.")
    public ResponseEntity<AnnounceResponseDto> findById(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }

    @GetMapping("/api/v1/announce")
    @ApiOperation(value = "전체 공지 조회",notes = "전체 공지 목록을 조회한다.")
    public ResponseEntity<List<AnnounceListResponseDto>> findAllDesc(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAllDesc());
    }

}
