package com.codesquad.sidedish.web.sidedish.controller;

import com.codesquad.sidedish.web.sidedish.DTO.ItemDTO;
import com.codesquad.sidedish.web.sidedish.service.SidedishCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SidedishController {
    SidedishCategoryService sidedishCategoryService;

    public SidedishController(SidedishCategoryService sidedishCategoryService) {
        this.sidedishCategoryService = sidedishCategoryService;
    }

    @GetMapping("/main")
    public List<ItemDTO> readMainSidedishes() {
        return sidedishCategoryService.readSideSidedishesBy("메인요리");
    }

    @GetMapping("/soup")
    public List<ItemDTO> readSoupSidedishes() {
        return sidedishCategoryService.readSideSidedishesBy("국물요리");
    }

    @GetMapping("/course")
    public List<ItemDTO> readCourseSidedishes() {
        return sidedishCategoryService.readSideSidedishesBy("코스요리");
    }

    @GetMapping("/side")
    public List<ItemDTO> readSideSidedishes() {
        return sidedishCategoryService.readSideSidedishesBy("밑반찬");
    }
}
