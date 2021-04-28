package com.codesquad.sidedish.web.sidedish.repository;

import com.codesquad.sidedish.web.sidedish.domain.Sidedish;
import com.codesquad.sidedish.web.sidedish.domain.SidedishCategory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

//@DataJdbcTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
class SidedishCategoryRepositoryTest {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SidedishCategoryRepository sidedishCategoryRepository;

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

        Sidedish sidedish = new Sidedish("반찬1", "설명", 100, 70, 5);

        SidedishCategory result = sidedishCategoryRepository.save(sidedishCategory.addSidedishes(sidedish));

        assertThat(result.getSidedishes()).contains(sidedish);
    }
}
