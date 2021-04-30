package com.codesquad.sidedish.utils;

import com.codesquad.sidedish.web.sidedish.DTO.BestSidedishDTO;
import com.codesquad.sidedish.web.sidedish.DTO.SidedishDTO;
import com.codesquad.sidedish.web.sidedish.ItemDTOTestResults;
import com.codesquad.sidedish.web.sidedish.SidedishDTOTestResults;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SampleDataFactoryTest {

    ObjectMapper objectMapper = new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);

    @Test
    void createBestSidedishes() throws JsonProcessingException {
        List<BestSidedishDTO> bestSidedishDTOs = SampleDataFactory.createBestSidedishes();

        assertThat(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(bestSidedishDTOs))
                .isEqualTo(SidedishDTOTestResults.BEST_MENU);

    }

    @Test
    void createMainSidedishes() throws JsonProcessingException {
        List<SidedishDTO> sidedishDTOs = SampleDataFactory.createMainSidedishes();

        assertThat(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(sidedishDTOs))
                .isEqualTo(ItemDTOTestResults.MAIN_MENU);
    }


    @Test
    void createCourseSidedishes() throws JsonProcessingException {
        List<SidedishDTO> sidedishDTOs = SampleDataFactory.createCourseSidedishes();

        assertThat(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(sidedishDTOs))
                .isEqualTo(ItemDTOTestResults.COURSE_MENU);
    }

    @Test
    void createSoupSidedishes() throws JsonProcessingException {
        List<SidedishDTO> sidedishDTOs = SampleDataFactory.createSoupSidedishes();

        assertThat(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(sidedishDTOs))
                .isEqualTo(ItemDTOTestResults.SOUP_MENU);
    }

    @Test
    void createSideSidedishes() throws JsonProcessingException {
        List<SidedishDTO> sidedishDTOs = SampleDataFactory.createSoupSidedishes();

        assertThat(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(sidedishDTOs))
                .isEqualTo(ItemDTOTestResults.SIDE_MENU);
    }
}
