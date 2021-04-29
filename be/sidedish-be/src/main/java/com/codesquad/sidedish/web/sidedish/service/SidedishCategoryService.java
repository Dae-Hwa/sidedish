package com.codesquad.sidedish.web.sidedish.service;

import com.codesquad.sidedish.web.sidedish.DTO.SidedishDTO;
import com.codesquad.sidedish.web.sidedish.DTO.BestSidedishDTO;
import com.codesquad.sidedish.web.sidedish.domain.SidedishCategory;
import com.codesquad.sidedish.web.sidedish.repository.SidedishCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SidedishCategoryService {
    SidedishCategoryRepository sidedishCategoryRepository;
    ImageService imageService;

    public SidedishCategoryService(SidedishCategoryRepository sidedishCategoryRepository, ImageService imageService) {
        this.sidedishCategoryRepository = sidedishCategoryRepository;
        this.imageService = imageService;
    }

    public List<BestSidedishDTO> readBestCategories() {
        return sidedishCategoryRepository.findByIsBestTrue().stream()
                .map(sidedishCategory -> BestSidedishDTO.of(sidedishCategory, imageService.readImagesAsMap()))
                .collect(Collectors.toList());
    }

    public List<SidedishDTO> readSideSidedishesBy(String categoryName) {
        return readBy(categoryName).sidedishStream()
                .map(sidedish -> SidedishDTO.of(sidedish, imageService.readImagesAsMap()))
                .collect(Collectors.toList());
    }

    private SidedishCategory readBy(String categoryName) {
        return sidedishCategoryRepository.findByNameIs(categoryName);
    }
}
