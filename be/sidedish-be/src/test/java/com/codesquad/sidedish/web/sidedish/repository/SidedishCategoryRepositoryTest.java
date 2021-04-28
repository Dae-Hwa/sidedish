package com.codesquad.sidedish.web.sidedish.repository;

import com.codesquad.sidedish.web.sidedish.domain.*;
import com.codesquad.sidedish.web.sidedish.domain.Price;
import com.codesquad.sidedish.web.sidedish.domain.Sidedish;
import com.codesquad.sidedish.web.sidedish.domain.SidedishBadge;
import com.codesquad.sidedish.web.sidedish.domain.SidedishCategory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@DataJdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class SidedishCategoryRepositoryTest {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SidedishCategoryRepository sidedishCategoryRepository;

    @Autowired
    ImageRepository imageRepository;

    @AfterEach
    void tearDown() {
        logger.debug("{}", sidedishCategoryRepository.findAll());
    }

    @Test
    void saveCategory() {
        SidedishCategory sidedishCategory = new SidedishCategory("메인반찬", false);

        SidedishCategory result = sidedishCategoryRepository.save(new SidedishCategory("메인반찬", false));

        assertThat(result.getName()).isEqualTo(sidedishCategory.getName());
    }

    @Test
    void saveSidedish() {
        SidedishCategory sidedishCategory = sidedishCategoryRepository.save(new SidedishCategory("메인반찬", false));

        Image image = imageRepository.save(new Image("test", "test"));
        Image thumbnailImage1 = imageRepository.save(new Image("test thumbnail", "test thumbnail"));
        Image thumbnailImage2 = imageRepository.save(new Image("test thumbnail2", "test thumbnail2"));

        Sidedish sidedish = new Sidedish("반찬1", "설명", new Price(100L), new Price(70L), 5, new SidedishImage(image.getId(), "test"));
        sidedish.addSidedishThumbImages(Arrays.asList(thumbnailImage1, thumbnailImage2));

        SidedishCategory result = sidedishCategoryRepository.save(sidedishCategory.addSidedishes(Arrays.asList(sidedish)));

        assertThat(result.getSidedishes()).contains(sidedish);
    }

    @Test
    void saveBadge() {
        SidedishBadge sidedishBadge = new SidedishBadge("뱃지");

        Sidedish sidedish = new Sidedish("반찬1", "설명", new Price(100L), new Price(70L), 5)
                .addSidedisheBadges(Arrays.asList(sidedishBadge));

        SidedishCategory sidedishCategory = sidedishCategoryRepository.save(new SidedishCategory("메인반찬", false)
                .addSidedishes(Arrays.asList(sidedish)));

        Sidedish result = sidedishCategory.getSidedishes().stream().findFirst().get();

        assertThat(result.getSidedisheBadges()).contains(sidedishBadge);

    }
}
