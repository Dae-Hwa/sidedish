package com.codesquad.sidedish.web.sidedish.controller;

import com.codesquad.sidedish.web.sidedish.DTO.ItemDTO;
import com.codesquad.sidedish.web.sidedish.service.SoupSidedishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SoupSidedishController {
    SoupSidedishService soupSidedishesService;

    @Autowired
    public SoupSidedishController(SoupSidedishService soupSidedishesService) {
        this.soupSidedishesService = soupSidedishesService;
    }

    @GetMapping("/soup")
    public List<ItemDTO> readSoupSidedishes() {
        return soupSidedishesService.getSoupSidedishList();
    }
}
