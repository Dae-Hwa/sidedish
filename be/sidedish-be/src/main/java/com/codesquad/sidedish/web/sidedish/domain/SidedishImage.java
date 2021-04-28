package com.codesquad.sidedish.web.sidedish.domain;

public class SidedishImage {
    private long imageId;
    private String name;

    public SidedishImage(long imageId, String name) {
        this.imageId = imageId;
        this.name = name;
    }

    public long getImageId() {
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
