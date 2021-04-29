package com.codesquad.sidedish.web.sidedish.service;

import com.codesquad.sidedish.web.sidedish.DTO.SidedishDTO;
import com.codesquad.sidedish.web.sidedish.domain.Sidedish;
import com.codesquad.sidedish.web.sidedish.repository.SidedishRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SidedishService {
    SidedishRepository sidedishRepository;
    ImageService imageService;

    public SidedishService(SidedishRepository sidedishRepository, ImageService imageService) {
        this.sidedishRepository = sidedishRepository;
        this.imageService = imageService;
    }

    public List<SidedishDTO> getRecommendedSidedishList() {
        List<Sidedish> sidedishes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            sidedishes.add(sidedishRepository.findById((long) (Math.random() * (sidedishRepository.count() - 1)) + 1).get());
        }

        return sidedishes
                .stream().map(s -> SidedishDTO.of(s, imageService.readImages()))
                .collect(Collectors.toList());
    }
}
