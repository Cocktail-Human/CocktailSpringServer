package com.springserver.cocktailspringserver.app.controller;

import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholListResponseDto;
import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholResponseDto;
import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholSaveRequestDto;
import com.springserver.cocktailspringserver.app.dto.alcohol.AlcoholUpdateRequestDto;
import com.springserver.cocktailspringserver.service.AlcoholService;
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
public class AlcoholApiController {

    private final AlcoholService service;
    @ApiImplicitParam(name = "requestDto", value = "저장할 주류")
    @ApiOperation(value = "주류 저장", notes = "주류를 저장한다.")
    @PostMapping("/api/v1/alcohol")
    public ResponseEntity<AlcoholSaveRequestDto> save(@RequestBody AlcoholSaveRequestDto requestDto){
        return ResponseEntity.status(HttpStatus.OK).body(service.save(requestDto));
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "주류 id"),
            @ApiImplicitParam(name = "requestDto", value = "업데이트할 주류")
    })
    @ApiOperation(value = "주류 업데이트",notes = "주류를 업데이트한다.")
    @PutMapping("/api/v1/alcohol/{id}")
    public ResponseEntity<Integer> update(@PathVariable Integer id, @RequestBody AlcoholUpdateRequestDto requestDto){
        return ResponseEntity.status(HttpStatus.OK).body(service.update(id,requestDto));
    }

    @ApiImplicitParam(name = "id", value = "주류 id")
    @ApiOperation(value = "주류 삭제",notes = "주류를 삭제한다.")
    @DeleteMapping("/api/v1/alcohol/{id}")
    public Integer delete(@PathVariable Integer id){
        service.delete(id);
        return id;
    }

    @GetMapping("/api/v1/alcohol/{id}")
    @ApiImplicitParam(name = "id", value = "주류 id")
    @ApiOperation(value = "주류 조회",notes = "주류를 조회한다.")
    public ResponseEntity<AlcoholResponseDto> findById(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }

    @GetMapping("/api/v1/alcohol")
    @ApiOperation(value = "전체 주류 조회",notes = "전체 주류목록을 조회한다.")
    public ResponseEntity<List<AlcoholListResponseDto>> findAllDesc(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAllDesc());
    }

}
