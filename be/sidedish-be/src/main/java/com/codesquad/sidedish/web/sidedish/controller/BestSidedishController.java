package com.codesquad.sidedish.web.sidedish.controller;

import com.codesquad.sidedish.web.sidedish.domain.SidedishCategory;
import com.codesquad.sidedish.web.sidedish.service.BestSidedishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BestSidedishController {
    BestSidedishService bestSidedishService;

    @Autowired
    public BestSidedishController(BestSidedishService bestSidedishService) {
        this.bestSidedishService = bestSidedishService;
    }

    @GetMapping("/best")
    public List<SidedishCategory> readBestSidedishes() {
        return bestSidedishService.getBestList();
    }
}
