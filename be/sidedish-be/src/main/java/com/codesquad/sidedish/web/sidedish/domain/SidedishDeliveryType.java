package com.codesquad.sidedish.web.sidedish.domain;

public class SidedishDeliveryType {
    private String name;

    public SidedishDeliveryType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SidedishDeliveryType{" +
                "name='" + name + '\'' +
                '}';
    }
}
