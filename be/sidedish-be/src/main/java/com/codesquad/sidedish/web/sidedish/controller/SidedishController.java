package com.codesquad.sidedish.web.sidedish.controller;

import com.codesquad.sidedish.web.sidedish.DTO.DetailDTO;
import com.codesquad.sidedish.web.sidedish.DTO.SidedishDTO;
import com.codesquad.sidedish.web.sidedish.DTO.BestSidedishDTO;
import com.codesquad.sidedish.web.sidedish.service.SidedishCategoryService;
import com.codesquad.sidedish.web.sidedish.service.SidedishService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SidedishController {
    SidedishCategoryService sidedishCategoryService;
    SidedishService sidedishService;

    public SidedishController(SidedishCategoryService sidedishCategoryService, SidedishService sidedishService) {
        this.sidedishCategoryService = sidedishCategoryService;
        this.sidedishService = sidedishService;
    }

    @GetMapping("/best")
    public List<BestSidedishDTO> readBestCategories() {
        return sidedishCategoryService.readBestCategories();
    }

    @GetMapping("/main")
    public List<SidedishDTO> readMainSidedishes() {
        return sidedishCategoryService.readSideSidedishesBy("메인요리");
    }

    @GetMapping("/soup")
    public List<SidedishDTO> readSoupSidedishes() {
        return sidedishCategoryService.readSideSidedishesBy("국물요리");
    }

    @GetMapping("/course")
    public List<SidedishDTO> readCourseSidedishes() {
        return sidedishCategoryService.readSideSidedishesBy("코스요리");
    }

    @GetMapping("/side")
    public List<SidedishDTO> readSideSidedishes() {
        return sidedishCategoryService.readSideSidedishesBy("밑반찬");
    }

    @GetMapping("/recommend")
    public List<SidedishDTO> readRecommendedSideSidedishes() {
        return sidedishService.getRecommendedSidedishList();
    }

    @GetMapping("/detail/{id}")
    public DetailDTO readOne(@PathVariable Long id) {
        return sidedishService.readOne(id);
    }
}
