package com.codesquad.sidedish.web.sidedish.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

import static org.springframework.data.relational.core.mapping.Embedded.OnEmpty.USE_NULL;

public class Sidedish {
    @Id
    private Long id;
    private String name;
    private String description;

    @Embedded(onEmpty = USE_NULL, prefix="NORMAL_")
    private Price normalPrice;

    @Embedded(onEmpty = USE_NULL, prefix="SALE_")
    private Price salePrice;
    private int stock;

    public Sidedish(String name, String description, Price normalPrice, Price salePrice, int stock) {
        this.name = name;
        this.description = description;
        this.normalPrice = normalPrice;
        this.salePrice = salePrice;
        this.stock = stock;
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

    @Override
    public String toString() {
        return "Sidedish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", normalPrice=" + normalPrice +
                ", salePrice=" + salePrice +
                ", stock=" + stock +
                '}';
    }
}
