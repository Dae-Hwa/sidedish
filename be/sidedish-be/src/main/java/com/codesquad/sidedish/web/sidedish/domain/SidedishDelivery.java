package com.codesquad.sidedish.web.sidedish.domain;

import org.springframework.data.relational.core.mapping.Embedded;

import static org.springframework.data.relational.core.mapping.Embedded.OnEmpty.USE_NULL;

public class SidedishDelivery {
    @Embedded(onEmpty = USE_NULL, prefix = "DELIVERY_")
    private Price deliveryPrice;

    public SidedishDelivery(Price deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Price getDeliveryPrice() {
        return deliveryPrice;
    }

    @Override
    public String toString() {
        return "SidedishDelivery{" +
                "deliveryPrice=" + deliveryPrice +
                '}';
    }
}
