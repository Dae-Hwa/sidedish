package com.codesquad.sidedish.web.sidedish.domain;

import org.springframework.data.annotation.Id;

public class Image {
    @Id
    private Long id;
    private String url;
    private String description;

    public Image(String url, String description) {
        this.url = url;
        this.description = description;
    }

    public SidedishImage sidedishImage(String sidedishImageName) {
        return new SidedishImage(id, sidedishImageName);
    }

    public SidedishThumbImage sidedishThumbImage() {
        return new SidedishThumbImage(id);
    }

    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", name='" + description + '\'' +
                '}';
    }
}
