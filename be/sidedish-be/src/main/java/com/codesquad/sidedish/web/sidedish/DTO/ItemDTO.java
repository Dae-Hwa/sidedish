package com.codesquad.sidedish.web.sidedish.DTO;

import com.codesquad.sidedish.web.sidedish.domain.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemDTO {
    private static final int DEFAULT_STOCK = 5;

    private String detailHash;
    private String image;
    private String alt;
    private List<String> deliveryType = Collections.emptyList();
    private String title;
    private String description;
    private Price nPrice;
    private Price sPrice;
    private List<String> badge = Collections.emptyList();

    public ItemDTO() {
    }

    public ItemDTO(String detailHash, String image, String alt, List<String> deliveryType, String title, String description, Price nPrice, Price sPrice, List<String> badge) {
        this.detailHash = detailHash;
        this.image = image;
        this.alt = alt;
        this.deliveryType = deliveryType;
        this.title = title;
        this.description = description;
        this.nPrice = nPrice;
        this.sPrice = sPrice;
        this.badge = badge;
    }

    public static ItemDTO of(Sidedish sidedish, Map<Long, Image> images) {
        ItemDTOBuilder builder = ItemDTO.builder()
                .detailHash(sidedish.getId().toString())
                .deliveryType(sidedish.sidedishDeliveryTypes().stream()
                        .map(SidedishDeliveryType::getName)
                        .collect(Collectors.toList())
                ).title(sidedish.getName())
                .description(sidedish.getDescription())
                .nPrice(sidedish.getNormalPrice())
                .sPrice(sidedish.getSalePrice())
                .badge(sidedish.getSidedisheBadges().stream()
                        .map(SidedishBadge::getName)
                        .collect(Collectors.toList())
                );

        if (sidedish.getSidedishImage() != null && images.containsKey(sidedish.imageId())) {
            builder.image(images.get(sidedish.imageId()).getUrl())
                    .alt(sidedish.imageName());
        }

        return builder.build();
    }

    public Sidedish sidedish() {
        return Sidedish.builder()
                .name(title)
                .description(description)
                .normalPrice(nPrice)
                .salePrice(sPrice)
                .stock(DEFAULT_STOCK)
                .sidedishDelivery(
                        SidedishDelivery
                                .builder()
                                .deliveryPrice(Price.DEFAULT_DELIVERY_PRICE)
                                .sidedishDeliveryDay(SidedishDeliveryDay.MONDAY_TO_SATURDAY)
                                .sidedishDeliveryTypes(deliveryType.stream().map(SidedishDeliveryType::new).collect(Collectors.toSet()))
                                .build()
                )
                .sidedisheBadges(badge.stream().map(SidedishBadge::new).collect(Collectors.toSet()))
                .build();
    }

    public static ItemDTOBuilder builder() {
        return ItemDTOBuilder.create();
    }

    public String getDetailHash() {
        return detailHash;
    }

    public void setDetailHash(String detailHash) {
        this.detailHash = detailHash;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public List<String> getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(List<String> deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getnPrice() {
        return nPrice != null ? nPrice.getFormattedPrice() : "";
    }

    public void setnPrice(Price nPrice) {
        this.nPrice = nPrice;
    }

    public String getsPrice() {
        return sPrice != null ? sPrice.getFormattedPrice() : "";
    }

    public void setsPrice(Price sPrice) {
        this.sPrice = sPrice;
    }

    public List<String> getBadge() {
        return badge;
    }

    public void setBadge(List<String> badge) {
        this.badge = badge;
    }

    public static final class ItemDTOBuilder {
        private String detailHash;
        private String image;
        private String alt;
        private List<String> deliveryType;
        private String title;
        private String description;
        private Price nPrice;
        private Price sPrice;
        private List<String> badge;

        private ItemDTOBuilder() {
        }

        public static ItemDTOBuilder create() {
            return new ItemDTOBuilder();
        }

        public ItemDTOBuilder detailHash(String detailHash) {
            this.detailHash = detailHash;
            return this;
        }

        public ItemDTOBuilder image(String image) {
            this.image = image;
            return this;
        }

        public ItemDTOBuilder alt(String alt) {
            this.alt = alt;
            return this;
        }

        public ItemDTOBuilder deliveryType(List<String> deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }

        public ItemDTOBuilder title(String title) {
            this.title = title;
            return this;
        }

        public ItemDTOBuilder description(String description) {
            this.description = description;
            return this;
        }

        public ItemDTOBuilder nPrice(Price nPrice) {
            this.nPrice = nPrice;
            return this;
        }

        public ItemDTOBuilder sPrice(Price sPrice) {
            this.sPrice = sPrice;
            return this;
        }

        public ItemDTOBuilder badge(List<String> badge) {
            this.badge = badge;
            return this;
        }

        public ItemDTO build() {
            return new ItemDTO(detailHash, image, alt, deliveryType, title, description, nPrice, sPrice, badge);
        }
    }
}
