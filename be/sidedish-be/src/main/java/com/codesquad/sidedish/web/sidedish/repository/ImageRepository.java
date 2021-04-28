package com.codesquad.sidedish.web.sidedish.repository;

import com.codesquad.sidedish.web.sidedish.domain.Image;
import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<Image, Long> {
}
