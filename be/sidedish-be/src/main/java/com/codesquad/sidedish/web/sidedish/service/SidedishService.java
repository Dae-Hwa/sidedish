package com.codesquad.sidedish.web.sidedish.service;

import com.codesquad.sidedish.web.sidedish.DTO.DetailDTO;
import com.codesquad.sidedish.web.sidedish.DTO.SidedishDTO;
import com.codesquad.sidedish.web.sidedish.domain.Image;
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
                .stream().map(s -> SidedishDTO.of(s, imageService.readImagesAsMap()))
                .collect(Collectors.toList());
    }

    public DetailDTO readOne(Long id) {
        Sidedish sidedish = sidedishRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        Image topImage = imageService.readImagesAsMap().getOrDefault(sidedish.imageId(), null);
        List<Image> thumbImages = imageService.readImage();

        return DetailDTO.of(sidedish, topImage, thumbImages);
    }
}
