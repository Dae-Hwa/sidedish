package com.codesquad.sidedish.web.sidedish.service;

import com.codesquad.sidedish.web.sidedish.domain.Image;
import com.codesquad.sidedish.web.sidedish.repository.ImageRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ImageService {
    ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public Map<Long, Image> readImagesAsMap() {
        return readImage().stream()
                .collect(Collectors.toMap(Image::getId, image -> image));
    }

    public List<Image> readImage() {
        return imageRepository.findAll();
    }

    public List<Image> readImageBy(List<Long> imageIds) {
        return imageRepository.findAllById(imageIds);
    }
}
