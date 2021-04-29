package com.codesquad.sidedish.web.sidedish.service;

import com.codesquad.sidedish.web.sidedish.DTO.ItemDTO;
import com.codesquad.sidedish.web.sidedish.domain.Image;
import com.codesquad.sidedish.web.sidedish.domain.SidedishCategory;
import com.codesquad.sidedish.web.sidedish.repository.ImageRepository;
import com.codesquad.sidedish.web.sidedish.repository.SidedishCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SidedishCategoryService {
    SidedishCategoryRepository sidedishCategoryRepository;
    ImageRepository imageRepository;

    public SidedishCategoryService(SidedishCategoryRepository sidedishCategoryRepository, ImageRepository imageRepository) {
        this.sidedishCategoryRepository = sidedishCategoryRepository;
        this.imageRepository = imageRepository;
    }

    public List<ItemDTO> readSideSidedishesBy(String categoryName) {
        Map<Long, Image> images = imageRepository.findAll().stream()
                .collect(Collectors.toMap(Image::getId, image -> image));

        return readBy(categoryName).sidedishStream()
                .map(sidedish -> ItemDTO.of(sidedish, images))
                .collect(Collectors.toList());
    }

    private SidedishCategory readBy(String categoryName) {
        return sidedishCategoryRepository.findByNameIs(categoryName);
    }
}
