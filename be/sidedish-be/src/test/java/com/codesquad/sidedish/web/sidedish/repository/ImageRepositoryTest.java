package com.codesquad.sidedish.web.sidedish.repository;

import com.codesquad.sidedish.web.sidedish.domain.Image;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class ImageRepositoryTest {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ImageRepository imageRepository;

    @AfterEach
    void tearDown() {
        logger.debug("{}", imageRepository.findAll());
    }

    @Test
    void save() {
        Image image = new Image("testurl", "test");

        imageRepository.save(image);
    }
}
