package com.codesquad.sidedish.web.sidedish.DTO;

import com.codesquad.sidedish.web.sidedish.domain.Image;
import com.codesquad.sidedish.web.sidedish.domain.Price;
import com.codesquad.sidedish.web.sidedish.domain.Sidedish;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DetailDataDTO {
    private String topImage;
    private List<String> thumbImages = Collections.emptyList();
    private String productDescription;
    private Price point;
    private String deliveryInfo;
    private Price deliveryFee;
    private List<Price> prices = Collections.emptyList();

    public DetailDataDTO() {
    }

    public DetailDataDTO(String topImage, List<String> thumbImages, String productDescription, Price point, String deliveryInfo, Price deliveryFee, List<Price> prices) {
        this.topImage = topImage;
        this.thumbImages = thumbImages;
        this.productDescription = productDescription;
        this.point = point;
        this.deliveryInfo = deliveryInfo;
        this.deliveryFee = deliveryFee;
        this.prices = prices;
    }

    public static DetailDataDTO of(Sidedish sidedish, Image topImage, List<Image> thumbImages) {
        return DetailDataDTO.builder()
                .topImage(topImage.getUrl())
                .thumbImages(thumbImages.stream().map(thumbImage -> thumbImage.getUrl()).collect(Collectors.toList()))
                .productDescription(sidedish.getDescription())
                .point(sidedish.point())
                .deliveryInfo("서울 경기 새벽배송 / 전국택배 (제주 및 도서산간 불가) [화 · 수 · 목 · 금 · 토] 수령 가능한 상품입니다.")
                .deliveryFee(sidedish.deliveryPrice())
                .prices(Arrays.asList(sidedish.getNormalPrice(), sidedish.getSalePrice()))
                .build();
    }

    public static DetailDataDTOBuilder builder() {
        return DetailDataDTOBuilder.create();
    }

    public String getTopImage() {
        return topImage;
    }

    public void setTopImage(String topImage) {
        this.topImage = topImage;
    }

    public List<String> getThumbImages() {
        return thumbImages;
    }

    public void setThumbImages(List<String> thumbImages) {
        this.thumbImages = thumbImages;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getPoint() {
        return point.getFormattedPrice();
    }

    public void setPoint(Price point) {
        this.point = point;
    }

    public String getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(String deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public String getDeliveryFee() {
        return deliveryFee.getFormattedPrice() + " (40,000원 이상 구매 시 무료)";
    }

    public void setDeliveryFee(Price deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public List<String> getPrices() {
        return prices.stream()
                .map(Price::getFormattedPrice)
                .collect(Collectors.toList());
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public static final class DetailDataDTOBuilder {
        private String topImage;
        private List<String> thumbImages;
        private String productDescription;
        private Price point;
        private String deliveryInfo;
        private Price deliveryFee;
        private List<Price> prices;

        private DetailDataDTOBuilder() {
        }

        public static DetailDataDTOBuilder create() {
            return new DetailDataDTO.DetailDataDTOBuilder();
        }

        public DetailDataDTOBuilder topImage(String topImage) {
            this.topImage = topImage;
            return this;
        }

        public DetailDataDTOBuilder thumbImages(List<String> thumbImages) {
            this.thumbImages = thumbImages;
            return this;
        }

        public DetailDataDTOBuilder productDescription(String productDescription) {
            this.productDescription = productDescription;
            return this;
        }

        public DetailDataDTOBuilder point(Price point) {
            this.point = point;
            return this;
        }

        public DetailDataDTOBuilder deliveryInfo(String deliveryInfo) {
            this.deliveryInfo = deliveryInfo;
            return this;
        }

        public DetailDataDTOBuilder deliveryFee(Price deliveryFee) {
            this.deliveryFee = deliveryFee;
            return this;
        }

        public DetailDataDTOBuilder prices(List<Price> prices) {
            this.prices = prices;
            return this;
        }

        public DetailDataDTO build() {
            return new DetailDataDTO(topImage, thumbImages, productDescription, point, deliveryInfo, deliveryFee, prices);
        }
    }
}
