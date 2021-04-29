package com.codesquad.sidedish.web.sidedish.service;

import com.codesquad.sidedish.web.sidedish.domain.SidedishCategory;
import com.codesquad.sidedish.web.sidedish.repository.SidedishCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BestSidedishService {
    SidedishCategoryRepository sidedishCategoryRepository;

    public BestSidedishService (SidedishCategoryRepository sidedishCategoryRepository) {
        this.sidedishCategoryRepository = sidedishCategoryRepository;
    }

    public List<SidedishCategory> getBestList() {
        return sidedishCategoryRepository.findByIsBestTrue();
    }
}
