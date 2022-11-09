package com.springserver.cocktailspringserver.app.controller;

import com.springserver.cocktailspringserver.app.dto.activity.ActivityListResponseDto;
import com.springserver.cocktailspringserver.app.dto.activity.ActivityResponseDto;
import com.springserver.cocktailspringserver.app.dto.activity.ActivitySaveRequestDto;
import com.springserver.cocktailspringserver.app.dto.activity.ActivityUpdateRequestDto;
import com.springserver.cocktailspringserver.servies.ActivityService;
import io.swagger.models.auth.In;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ActivityApiController {
    private final ActivityService activityService;
    @PostMapping("/api/v1/activity")
    public ResponseEntity<ActivitySaveRequestDto> save(@RequestBody ActivitySaveRequestDto requestDto){
        return ResponseEntity.status(HttpStatus.OK).body(activityService.save(requestDto));
    }

    @PutMapping("/api/v1/activity/{id}")
    public ResponseEntity<Integer> update(@PathVariable Integer id, @RequestBody ActivityUpdateRequestDto requestDto){
        return ResponseEntity.status(HttpStatus.OK).body(activityService.update(id,requestDto));
    }
    @DeleteMapping("/api/v1/activity/{id}")
    public Integer delete(@PathVariable Integer id){
        activityService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/activity/{id}")
    public ResponseEntity<ActivityResponseDto> findById(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(activityService.findById(id));
    }

    @GetMapping("/api/v1/activity")
    public ResponseEntity<List<ActivityListResponseDto>> findAllDesc(){
        return ResponseEntity.status(HttpStatus.OK).body(activityService.findAllDesc());
    }
}
