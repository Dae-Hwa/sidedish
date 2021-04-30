package com.codesquad.sidedish.web.sidedish.repository;

import com.codesquad.sidedish.web.sidedish.domain.Image;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface ImageRepository extends CrudRepository<Image, Long> {
    List<Image> findAll();
    List<Image> findAllById(Iterable<Long> ids);
}
