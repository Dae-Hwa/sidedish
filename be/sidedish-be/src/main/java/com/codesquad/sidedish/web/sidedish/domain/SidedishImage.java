package com.codesquad.sidedish.web.sidedish.domain;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.relational.core.mapping.Table;

public class SidedishImage {
    private Long imageId;
    private String name;

    public SidedishImage(Long imageId, String name) {
        this.imageId = imageId;
        this.name = name;
    }

    public static SidedishImage empty() {
        return new SidedishImage(null, "");
    }

    public Long getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SidedishImage{" +
                "imageId=" + imageId +
                ", name='" + name + '\'' +
                '}';
    }
}
