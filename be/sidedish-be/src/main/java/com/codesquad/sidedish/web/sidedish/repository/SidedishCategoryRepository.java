package com.codesquad.sidedish.web.sidedish.repository;

import com.codesquad.sidedish.web.sidedish.domain.SidedishCategory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SidedishCategoryRepository extends CrudRepository<SidedishCategory, Long> {
    SidedishCategory findByNameIs(String name);

    List<SidedishCategory> findByIsBestTrue();
}
