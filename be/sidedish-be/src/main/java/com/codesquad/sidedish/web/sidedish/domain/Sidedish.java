package com.codesquad.sidedish.web.sidedish.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.springframework.data.relational.core.mapping.Embedded.OnEmpty.USE_NULL;

public class Sidedish {
    @Id
    private Long id;
    private String name;
    private String description;

    @Embedded(onEmpty = USE_NULL, prefix = "NORMAL_")
    private Price normalPrice;

    @Embedded(onEmpty = USE_NULL, prefix = "SALE_")
    private Price salePrice;
    private int stock;

    @Column("SIDEDISH_ID")
    private SidedishImage sidedishImage;

    @MappedCollection(idColumn = "SIDEDISH_ID")
    private Set<SidedishThumbImage> sidedishThumbImages = new HashSet<>();

    @MappedCollection(idColumn = "SIDEDISH_ID")
    private Set<SidedishBadge> sidedisheBadges = new HashSet<>();
    public Sidedish(String name, String description, Price normalPrice, Price salePrice, int stock, SidedishImage sidedishImage) {
        this.name = name;
        this.description = description;
        this.normalPrice = normalPrice;
        this.salePrice = salePrice;
        this.stock = stock;
        this.sidedishImage = sidedishImage;
    }

    public Sidedish addSidedishThumbImages(Collection<Image> images) {
        List<SidedishThumbImage> sidedishThumbImage = images.parallelStream()
                .map(Image::sidedishThumbImage)
                .collect(Collectors.toList());

        this.sidedishThumbImages.addAll(sidedishThumbImage);
        return this;
    }

    public Sidedish addSidedisheBadges(Collection<SidedishBadge> sidedisheBadges) {
        this.sidedisheBadges.addAll(sidedisheBadges);
        return this;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Price getNormalPrice() {
        return normalPrice;
    }

    public Price getSalePrice() {
        return salePrice;
    }

    public int getStock() {
        return stock;
    }

    public Set<SidedishBadge> getSidedisheBadges() {
        return sidedisheBadges;
    }

    public SidedishImage getSidedishImage() {
        return sidedishImage;
    }

    @Override
    public String toString() {
        return "Sidedish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", normalPrice=" + normalPrice +
                ", salePrice=" + salePrice +
                ", stock=" + stock +
                ", sidedishImage=" + sidedishImage +
                ", sidedishThumbImages=" + sidedishThumbImages +
                '}';
    }
}
