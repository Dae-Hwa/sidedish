package com.codesquad.sidedish.web.sidedish.service;

import com.codesquad.sidedish.web.sidedish.domain.Sidedish;
import com.codesquad.sidedish.web.sidedish.repository.SidedishRepository;
import org.springframework.stereotype.Service;

@Service
public class DetailService {
    SidedishRepository sidedishRepository;

    public DetailService (SidedishRepository sidedishRepository) {
        this.sidedishRepository = sidedishRepository;
    }

    public Sidedish getOne(Long id) {
        return sidedishRepository.findById(id).orElseThrow(NullPointerException::new);
    }
}
