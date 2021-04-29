package com.codesquad.sidedish.web.sidedish.controller;

import com.codesquad.sidedish.web.sidedish.DTO.ItemDTO;
import com.codesquad.sidedish.web.sidedish.service.MainSidedishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainSidedishController {
    MainSidedishService mainSidedishService;

    @Autowired
    public MainSidedishController(MainSidedishService mainSidedishService) {
        this.mainSidedishService = mainSidedishService;
    }

    @GetMapping("/main")
    public List<ItemDTO> readMainSidedishes() {
        return mainSidedishService.getMainSidedishList();
    }
}
