package com.codesquad.sidedish.web.sidedish.DTO;

import com.codesquad.sidedish.web.sidedish.domain.Image;
import com.codesquad.sidedish.web.sidedish.domain.Sidedish;

import java.util.List;

public class DetailDTO {
    private String hash;
    private DetailDataDTO data;

    public DetailDTO() {
    }

    public DetailDTO(String hash, DetailDataDTO data) {
        this.hash = hash;
        this.data = data;
    }

    public static DetailDTO of(Sidedish sidedish, Image topImage, List<Image> thumbImages) {
        return DetailDTO.builder()
                .hash(sidedish.getId().toString())
                .data(DetailDataDTO.of(sidedish, topImage, thumbImages))
                .build();
    }

    public static DetailDTOBuilder builder() {
        return DetailDTOBuilder.create();
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public DetailDataDTO getData() {
        return data;
    }

    public void setData(DetailDataDTO data) {
        this.data = data;
    }


    public static final class DetailDTOBuilder {
        private String hash;
        private DetailDataDTO data;

        private DetailDTOBuilder() {
        }

        public static DetailDTOBuilder create() {
            return new DetailDTOBuilder();
        }

        public DetailDTOBuilder hash(String hash) {
            this.hash = hash;
            return this;
        }

        public DetailDTOBuilder data(DetailDataDTO data) {
            this.data = data;
            return this;
        }

        public DetailDTO build() {
            return new DetailDTO(hash, data);
        }
    }
}
