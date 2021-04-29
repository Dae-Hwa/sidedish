package com.codesquad.sidedish.web.sidedish.service;

import com.codesquad.sidedish.web.sidedish.DTO.ItemDTO;
import com.codesquad.sidedish.web.sidedish.domain.Image;
import com.codesquad.sidedish.web.sidedish.domain.Sidedish;
import com.codesquad.sidedish.web.sidedish.repository.ImageRepository;
import com.codesquad.sidedish.web.sidedish.repository.SidedishCategoryRepository;
import com.codesquad.sidedish.web.sidedish.repository.SidedishRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RecommendService {
    SidedishCategoryRepository sidedishCategoryRepository;
    SidedishRepository sidedishRepository;
    ImageRepository imageRepository;

    public RecommendService(SidedishCategoryRepository sidedishCategoryRepository, SidedishRepository sidedishRepository, ImageRepository imageRepository) {
        this.sidedishCategoryRepository = sidedishCategoryRepository;
        this.sidedishRepository = sidedishRepository;
        this.imageRepository = imageRepository;
    }

    public List<ItemDTO> getRecommendSidedishList() {
        List<Sidedish> sidedishes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            sidedishes.add(sidedishRepository.findById((long) (Math.random() * (sidedishRepository.count() - 1)) + 1).get());
        }

        Map<Long, Image> images = new HashMap<>();

        for (Image i : imageRepository.findAll()) {
            images.put(i.getId(), i);
        }

        return sidedishes
                .stream().map(s -> ItemDTO.of(s, images))
                .collect(Collectors.toList());
    }
}
