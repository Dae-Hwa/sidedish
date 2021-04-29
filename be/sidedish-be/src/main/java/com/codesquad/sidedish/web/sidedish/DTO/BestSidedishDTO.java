package com.codesquad.sidedish.web.sidedish.DTO;

import com.codesquad.sidedish.web.sidedish.domain.Image;
import com.codesquad.sidedish.web.sidedish.domain.SidedishCategory;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BestSidedishDTO {
    private long categoryId;
    private String name;
    private List<SidedishDTO> items = Collections.emptyList();

    public BestSidedishDTO() {
    }

    public BestSidedishDTO(long categoryId, String name, List<SidedishDTO> items) {
        this.categoryId = categoryId;
        this.name = name;
        this.items = items;
    }

    public static BestSidedishDTO of(SidedishCategory sidedishCategory, Map<Long, Image> images) {
        return BestSidedishDTO.builder()
                .categoryId(sidedishCategory.getId())
                .name(sidedishCategory.getName())
                .items(sidedishCategory.getSidedishes().stream()
                        .map(sidedish -> SidedishDTO.of(sidedish, images))
                        .collect(Collectors.toList())
                )
                .build();
    }

    public SidedishCategory sidedishCategory() {
        return new SidedishCategory(name, false)
                .addSidedishes(items.stream().map(SidedishDTO::sidedish).collect(Collectors.toList()));
    }

    public SidedishCategory sidedishBestCategory() {
        return new SidedishCategory(name, true)
                .addSidedishes(items.stream().map(SidedishDTO::sidedish).collect(Collectors.toList()));
    }


    public static SidedishDTOBuilder builder() {
        return SidedishDTOBuilder.create();
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SidedishDTO> getItems() {
        return items;
    }

    public void setItems(List<SidedishDTO> items) {
        this.items = items;
    }

    public static final class SidedishDTOBuilder {
        private long categoryId;
        private String name;
        private List<SidedishDTO> items;

        private SidedishDTOBuilder() {
        }

        public static SidedishDTOBuilder create() {
            return new SidedishDTOBuilder();
        }

        public SidedishDTOBuilder categoryId(long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public SidedishDTOBuilder name(String name) {
            this.name = name;
            return this;
        }

        public SidedishDTOBuilder items(List<SidedishDTO> items) {
            this.items = items;
            return this;
        }

        public BestSidedishDTO build() {
            return new BestSidedishDTO(categoryId, name, items);
        }
    }
}
