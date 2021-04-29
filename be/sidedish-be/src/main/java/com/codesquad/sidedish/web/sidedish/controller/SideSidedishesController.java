
package com.codesquad.sidedish.web.sidedish.controller;

import com.codesquad.sidedish.web.sidedish.DTO.ItemDTO;
import com.codesquad.sidedish.web.sidedish.service.SideSidedishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SideSidedishesController {
    SideSidedishesService sideSidedishesService;

    @Autowired
    public SideSidedishesController(SideSidedishesService sideSidedishesService) {
        this.sideSidedishesService = sideSidedishesService;
    }

    @GetMapping("/side")
    public List<ItemDTO> readSideSidedishes() {
        return sideSidedishesService.getSideSidedishList();
    }
}
