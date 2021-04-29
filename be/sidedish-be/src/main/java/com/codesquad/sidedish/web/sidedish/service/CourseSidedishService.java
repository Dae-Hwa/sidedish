package com.codesquad.sidedish.web.sidedish.service;

import com.codesquad.sidedish.web.sidedish.DTO.ItemDTO;
import com.codesquad.sidedish.web.sidedish.domain.Image;
import com.codesquad.sidedish.web.sidedish.repository.ImageRepository;
import com.codesquad.sidedish.web.sidedish.repository.SidedishCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CourseSidedishService {
    SidedishCategoryRepository sidedishCategoryRepository;
    ImageRepository imageRepository;

    public CourseSidedishService (SidedishCategoryRepository sidedishCategoryRepository, ImageRepository imageRepository) {
        this.sidedishCategoryRepository = sidedishCategoryRepository;
        this.imageRepository = imageRepository;
    }

    public List<ItemDTO> getCourseSidedishList() {
        Map<Long, Image> images = new HashMap<>();

        for(Image i : imageRepository.findAll()) {
            images.put(i.getId(), i);
        }

        return sidedishCategoryRepository.findByNameIs("코스요리").getSidedishes()
                .stream().map(s -> ItemDTO.of(s, images))
                .collect(Collectors.toList());
    }
}
