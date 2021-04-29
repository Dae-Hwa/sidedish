package com.codesquad.sidedish.web.sidedish.controller;

import com.codesquad.sidedish.web.sidedish.DTO.ItemDTO;
import com.codesquad.sidedish.web.sidedish.service.CourseSidedishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseSidedishController {
    CourseSidedishService courseSidedishService;

    @Autowired
    public CourseSidedishController(CourseSidedishService courseSidedishService) {
        this.courseSidedishService = courseSidedishService;
    }

    @GetMapping("/course")
    public List<ItemDTO> readCourseSidedishes() {
        return courseSidedishService.getCourseSidedishList();
    }
}
