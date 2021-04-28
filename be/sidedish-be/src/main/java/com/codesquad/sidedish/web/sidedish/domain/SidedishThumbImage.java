package com.codesquad.sidedish.web.sidedish.domain;

public class SidedishThumbImage {
    private long imageId;

    public SidedishThumbImage(long imageId) {
        this.imageId = imageId;
    }

    public long getImageId() {
        return imageId;
    }

    @Override
    public String toString() {
        return "SidedishThumbImage{" +
                "imageId=" + imageId +
                '}';
    }
}
