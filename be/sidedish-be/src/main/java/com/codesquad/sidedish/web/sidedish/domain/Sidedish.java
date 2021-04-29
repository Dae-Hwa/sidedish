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
    private SidedishDelivery sidedishDelivery;

    @Column("SIDEDISH_ID")
    private SidedishImage sidedishImage;

    @MappedCollection(idColumn = "SIDEDISH_ID")
    private Set<SidedishThumbImage> sidedishThumbImages = new HashSet<>();

    @MappedCollection(idColumn = "SIDEDISH_ID")
    private Set<SidedishBadge> sidedisheBadges = new HashSet<>();

    public Sidedish(String name, String description, Price normalPrice, Price salePrice, int stock, SidedishDelivery sidedishDelivery, SidedishImage sidedishImage) {
        this.name = name;
        this.description = description;
        this.normalPrice = normalPrice;
        this.salePrice = salePrice;
        this.stock = stock;
        this.sidedishDelivery = sidedishDelivery == null ? SidedishDelivery.empty() : sidedishDelivery;
        this.sidedishImage =  sidedishImage;
    }

    public static SidedishBuilder builder() {
        return SidedishBuilder.create();
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

    public SidedishDelivery getSidedishDelivery() {
        return sidedishDelivery;
    }

    public SidedishImage getSidedishImage() {
        return sidedishImage;
    }

    public Set<SidedishThumbImage> getSidedishThumbImages() {
        return sidedishThumbImages;
    }

    public Set<SidedishBadge> getSidedisheBadges() {
        return sidedisheBadges;
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
                ", sidedishDelivery=" + sidedishDelivery +
                ", sidedishImage=" + sidedishImage +
                ", sidedishThumbImages=" + sidedishThumbImages +
                ", sidedisheBadges=" + sidedisheBadges +
                '}';
    }

    public static final class SidedishBuilder {
        private Long id;
        private String name;
        private String description;
        private Price normalPrice;
        private Price salePrice;
        private int stock;
        private SidedishDelivery sidedishDelivery;
        private SidedishImage sidedishImage;
        private Set<SidedishThumbImage> sidedishThumbImages = new HashSet<>();
        private Set<SidedishBadge> sidedisheBadges = new HashSet<>();

        private SidedishBuilder() {
        }

        public static SidedishBuilder create() {
            return new SidedishBuilder();
        }

        public SidedishBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public SidedishBuilder name(String name) {
            this.name = name;
            return this;
        }

        public SidedishBuilder description(String description) {
            this.description = description;
            return this;
        }

        public SidedishBuilder normalPrice(Price normalPrice) {
            this.normalPrice = normalPrice;
            return this;
        }

        public SidedishBuilder salePrice(Price salePrice) {
            this.salePrice = salePrice;
            return this;
        }

        public SidedishBuilder stock(int stock) {
            this.stock = stock;
            return this;
        }

        public SidedishBuilder sidedishDelivery(SidedishDelivery sidedishDelivery) {
            this.sidedishDelivery = sidedishDelivery;
            return this;
        }

        public SidedishBuilder sidedishImage(SidedishImage sidedishImage) {
            this.sidedishImage = sidedishImage;
            return this;
        }

        public SidedishBuilder sidedishThumbImages(Set<SidedishThumbImage> sidedishThumbImages) {
            this.sidedishThumbImages = sidedishThumbImages;
            return this;
        }

        public SidedishBuilder sidedisheBadges(Set<SidedishBadge> sidedisheBadges) {
            this.sidedisheBadges = sidedisheBadges;
            return this;
        }

        public Sidedish build() {
            Sidedish sidedish = new Sidedish(name, description, normalPrice, salePrice, stock, sidedishDelivery, sidedishImage);
            sidedish.id = this.id;
            sidedish.sidedishThumbImages = this.sidedishThumbImages;
            sidedish.sidedisheBadges = this.sidedisheBadges;
            return sidedish;
        }
    }
}
