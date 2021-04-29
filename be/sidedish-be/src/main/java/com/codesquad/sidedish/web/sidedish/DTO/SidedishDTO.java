package com.codesquad.sidedish.web.sidedish.DTO;

import com.codesquad.sidedish.web.sidedish.domain.Image;
import com.codesquad.sidedish.web.sidedish.domain.SidedishCategory;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SidedishDTO {
    private long categoryId;
    private String name;
    private List<ItemDTO> items = Collections.emptyList();

    public SidedishDTO() {
    }

    public SidedishDTO(long categoryId, String name, List<ItemDTO> items) {
        this.categoryId = categoryId;
        this.name = name;
        this.items = items;
    }

    public static SidedishDTO of(SidedishCategory sidedishCategory, Map<Long, Image> images) {
        return SidedishDTO.builder()
                .categoryId(sidedishCategory.getId())
                .name(sidedishCategory.getName())
                .items(sidedishCategory.getSidedishes().stream()
                        .map(sidedish -> ItemDTO.of(sidedish, images))
                        .collect(Collectors.toList())
                )
                .build();
    }

    public SidedishCategory sidedishCategory() {
        return new SidedishCategory(name, false)
                .addSidedishes(items.stream().map(ItemDTO::sidedish).collect(Collectors.toList()));
    }

    public SidedishCategory sidedishBestCategory() {
        return new SidedishCategory(name, true)
                .addSidedishes(items.stream().map(ItemDTO::sidedish).collect(Collectors.toList()));
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

    public List<ItemDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemDTO> items) {
        this.items = items;
    }

    public static final class SidedishDTOBuilder {
        private long categoryId;
        private String name;
        private List<ItemDTO> items;

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

        public SidedishDTOBuilder items(List<ItemDTO> items) {
            this.items = items;
            return this;
        }

        public SidedishDTO build() {
            return new SidedishDTO(categoryId, name, items);
        }
    }
}
