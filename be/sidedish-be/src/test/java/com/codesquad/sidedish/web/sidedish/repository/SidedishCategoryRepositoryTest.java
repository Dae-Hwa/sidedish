package com.codesquad.sidedish.web.sidedish.repository;

import com.codesquad.sidedish.web.sidedish.domain.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.Arrays;
import java.util.HashSet;

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
    void tearDown() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        logger.debug("\n{}", objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(sidedishCategoryRepository.findAll()));
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

        Sidedish sidedish = Sidedish.builder()
                .name("반찬1")
                .description("설명")
                .normalPrice(new Price(100L))
                .salePrice(new Price(70L))
                .stock(5)
                .build();

        SidedishCategory result = sidedishCategoryRepository.save(sidedishCategory.addSidedishes(Arrays.asList(sidedish)));

        assertThat(result.getSidedishes()).contains(sidedish);
    }

    @Test
    void saveImage() {
        SidedishCategory sidedishCategory = sidedishCategoryRepository.save(new SidedishCategory("메인반찬", false));

        Image image = imageRepository.save(new Image("test", "test"));
        Image thumbnailImage1 = imageRepository.save(new Image("test thumbnail", "test thumbnail"));
        Image thumbnailImage2 = imageRepository.save(new Image("test thumbnail2", "test thumbnail2"));

        Sidedish sidedish = Sidedish.builder()
                .name("반찬1")
                .description("설명")
                .normalPrice(new Price(100L))
                .salePrice(new Price(70L))
                .stock(5)
                .sidedishImage(image.sidedishImage("test"))
                .build();

        sidedish.addSidedishThumbImages(Arrays.asList(thumbnailImage1, thumbnailImage2));

        SidedishCategory result = sidedishCategoryRepository.save(sidedishCategory.addSidedishes(Arrays.asList(sidedish)));

        assertThat(result.getSidedishes()).contains(sidedish);
    }

    @Test
    void saveBadge() {
        SidedishBadge sidedishBadge = new SidedishBadge("뱃지");
        SidedishCategory sidedishCategory = sidedishCategoryRepository.save(new SidedishCategory("메인반찬", false));

        Sidedish sidedish = Sidedish.builder()
                .name("반찬1")
                .description("설명")
                .normalPrice(new Price(100L))
                .salePrice(new Price(70L))
                .stock(5)
                .sidedisheBadges(new HashSet<>(Arrays.asList(sidedishBadge)))
                .build();

        SidedishCategory result = sidedishCategoryRepository.save(sidedishCategory.addSidedishes(Arrays.asList(sidedish)));

        assertThat(result.getSidedishes()).contains(sidedish);
    }

    @Test
    void saveDelivery() {
        SidedishCategory sidedishCategory = sidedishCategoryRepository.save(new SidedishCategory("메인반찬", false));

        Sidedish sidedish = Sidedish.builder()
                .name("반찬1")
                .description("설명")
                .normalPrice(new Price(100L))
                .salePrice(new Price(70L))
                .stock(5)
                .sidedishDelivery(new SidedishDelivery(new Price(2500L), null))
                .build();

        SidedishCategory result = sidedishCategoryRepository.save(sidedishCategory.addSidedishes(Arrays.asList(sidedish)));

        assertThat(result.getSidedishes()).contains(sidedish);
    }

    @Test
    void saveDeliveryDay() {
        SidedishCategory sidedishCategory = sidedishCategoryRepository.save(new SidedishCategory("메인반찬", false));

        Sidedish sidedish = Sidedish.builder()
                .name("반찬1")
                .description("설명")
                .normalPrice(new Price(100L))
                .salePrice(new Price(70L))
                .stock(5)
                .sidedishDelivery(new SidedishDelivery(
                        new Price(2500L),
                        new SidedishDeliveryDay(true, true, true, true, true, true, false)
                ))
                .build();

        SidedishCategory result = sidedishCategoryRepository.save(sidedishCategory.addSidedishes(Arrays.asList(sidedish)));

        assertThat(result.getSidedishes()).contains(sidedish);
    }

    @Test
    void saveDeliveryType() {
        SidedishCategory sidedishCategory = sidedishCategoryRepository.save(new SidedishCategory("메인반찬", false));

        Sidedish sidedish = Sidedish.builder()
                .name("반찬1")
                .description("설명")
                .normalPrice(new Price(100L))
                .salePrice(new Price(70L))
                .stock(5)
                .sidedishDelivery(
                        new SidedishDelivery(new Price(2500L), null)
                                .addSidedishDeliveryTypes(Arrays.asList(new SidedishDeliveryType("전국배송")))
                )
                .build();

        SidedishCategory result = sidedishCategoryRepository.save(sidedishCategory.addSidedishes(Arrays.asList(sidedish)));

        assertThat(result.getSidedishes()).contains(sidedish);
    }
}
