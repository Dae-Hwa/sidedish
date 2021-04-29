package com.codesquad.sidedish.web.sidedish.domain;

import org.springframework.data.annotation.PersistenceConstructor;

import java.text.NumberFormat;
import java.text.ParseException;

public class Price {
    public static final Price DEFAULT_DELIVERY_PRICE = new Price(2500L);

    private static final String POSTFIX = "원";

    private final long price;

    @PersistenceConstructor
    public Price(long price) {
        this.price = price;
    }

    public Price(String price) {
        this(parsePrice(price));
    }

    public String getFormattedPrice() {
        return NumberFormat.getInstance().format(price) + POSTFIX;
    }

    private static long parsePrice(String price) {
        try {
            return NumberFormat.getInstance().parse(price).longValue();
        } catch (ParseException e) {
            throw new IllegalArgumentException("Error occurred while parsing price, price : " + price, e);
        }
    }

    @Override
    public String toString() {
        return "Price{" +
                "price=" + price +
                '}';
    }
}
