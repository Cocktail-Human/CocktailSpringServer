package com.springserver.cocktailspringserver.app.controller;

import com.springserver.cocktailspringserver.app.dto.activity.ActivityListResponseDto;
import com.springserver.cocktailspringserver.app.dto.activity.ActivityResponseDto;
import com.springserver.cocktailspringserver.app.dto.activity.ActivitySaveRequestDto;
import com.springserver.cocktailspringserver.app.dto.activity.ActivityUpdateRequestDto;
import com.springserver.cocktailspringserver.service.ActivityService;
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
public class ActivityApiController {
    private final ActivityService activityService;
    @ApiImplicitParam(name = "requestDto", value = "저장할 활동")
    @ApiOperation(value = "활동 삭제",notes = "활동을 저장한다.")
    @PostMapping("/api/v1/activity")
    public ResponseEntity<ActivitySaveRequestDto> save(@RequestBody ActivitySaveRequestDto requestDto){
        return ResponseEntity.status(HttpStatus.OK).body(activityService.save(requestDto));
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "활동 id"),
            @ApiImplicitParam(name = "requestDto", value = "업데이트할 활동 Json Body")
    })
    @ApiOperation(value = "활동 업데이트",notes = "활동을 업데이트한다.")
    @PutMapping("/api/v1/activity/{id}")
    public ResponseEntity<Integer> update(@PathVariable Integer id, @RequestBody ActivityUpdateRequestDto requestDto){
        return ResponseEntity.status(HttpStatus.OK).body(activityService.update(id,requestDto));
    }

    @ApiImplicitParam(name = "id", value = "활동 id")
    @ApiOperation(value = "활동 삭제",notes = "활동을 삭제한다.")
    @DeleteMapping("/api/v1/activity/{id}")
    public Integer delete(@PathVariable Integer id){
        activityService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/activity/{id}")
    @ApiImplicitParam(name = "id", value = "활동 id")
    @ApiOperation(value = "활동 조회",notes = "활동을 조회한다.")
    public ResponseEntity<ActivityResponseDto> findById(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(activityService.findById(id));
    }

    @GetMapping("/api/v1/activity")
    @ApiOperation(value = "전체 활동 조회",notes = "전체 활동목록을 조회한다.")
    public ResponseEntity<List<ActivityListResponseDto>> findAllDesc(){
        return ResponseEntity.status(HttpStatus.OK).body(activityService.findAllDesc());
    }
}
