package com.codesquad.sidedish.web.sidedish.controller;

import com.codesquad.sidedish.web.sidedish.domain.Sidedish;
import com.codesquad.sidedish.web.sidedish.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailController {
    DetailService detailService;

    @Autowired
    public DetailController(DetailService detailService) {
        this.detailService = detailService;
    }

    @GetMapping("/detail/{id}")
    public Sidedish readOne(@PathVariable Long id) {
        return detailService.getOne(id);
    }
}
