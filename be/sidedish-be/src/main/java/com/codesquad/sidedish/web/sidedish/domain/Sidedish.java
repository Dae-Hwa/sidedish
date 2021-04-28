package com.codesquad.sidedish.web.sidedish.domain;

import org.springframework.data.annotation.Id;

public class Sidedish {
    @Id
    private Long id;
    private String name;
    private String description;
    private long normalPrice;
    private long salePrice;
    private int stock;

    public Sidedish(String name, String description, long normalPrice, long salePrice, int stock) {
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

    public long getNormalPrice() {
        return normalPrice;
    }

    public long getSalePrice() {
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
