package com.springserver.cocktailspringserver.app.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.springserver.cocktailspringserver.app.dto.ActivityDto;
import com.springserver.cocktailspringserver.app.dto.ActivityResponseDto;
import com.springserver.cocktailspringserver.servies.ActivityService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ActivityController {
    private final ActivityService activityService;

    @Autowired
    public ActivityController(ActivityService activityService){
        this.activityService = activityService;
    }

    @PostMapping("/activity")
    public ResponseEntity<ActivityResponseDto> createActivity(@RequestBody ActivityDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(activityService.save(dto));
    }

    @GetMapping("/activity")
    public ActivityDto activityRead(@PathVariable Integer id){
        //model.addAttribute("activity",dto);
        return activityService.findById(id);
    }
}
