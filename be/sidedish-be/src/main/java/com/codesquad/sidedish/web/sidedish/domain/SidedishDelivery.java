package com.codesquad.sidedish.web.sidedish.domain;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.springframework.data.relational.core.mapping.Embedded.OnEmpty.USE_NULL;

public class SidedishDelivery {
    @Embedded(onEmpty = USE_NULL, prefix = "DELIVERY_")
    private Price deliveryPrice;

    @Column("SIDEDISH_ID")
    private SidedishDeliveryDay sidedishDeliveryDay;

    @MappedCollection(idColumn = "SIDEDISH_ID")
    private Set<SidedishDeliveryType> sidedishDeliveryTypes = new HashSet<>();

    public SidedishDelivery(Price deliveryPrice, SidedishDeliveryDay sidedishDeliveryDay) {
        this.deliveryPrice = deliveryPrice;
        this.sidedishDeliveryDay = sidedishDeliveryDay;
    }

    public static SidedishDelivery empty() {
        return new SidedishDelivery(new Price(0L), new SidedishDeliveryDay(false, false, false, false, false, false, false))
                .addSidedishDeliveryTypes(Collections.emptyList());
    }

    public SidedishDelivery addSidedishDeliveryTypes(Collection<SidedishDeliveryType> sidedishDeliveryTypes) {
        this.sidedishDeliveryTypes.addAll(sidedishDeliveryTypes);
        return this;
    }

    public Price getDeliveryPrice() {
        return deliveryPrice;
    }

    public SidedishDeliveryDay getSidedishDeliveryDay() {
        return sidedishDeliveryDay;
    }

    public Set<SidedishDeliveryType> getSidedishDeliveryTypes() {
        return sidedishDeliveryTypes;
    }

    @Override
    public String toString() {
        return "SidedishDelivery{" +
                "deliveryPrice=" + deliveryPrice +
                ", sidedishDeliveryDay=" + sidedishDeliveryDay +
                ", sidedishDeliveryTypes=" + sidedishDeliveryTypes +
                '}';
    }
}
