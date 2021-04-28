package com.codesquad.sidedish.web.sidedish.domain;

import org.springframework.data.annotation.Id;

public class SidedishBadge {

    @Id
    private Long id;
    private String name;

    public SidedishBadge(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SidedishBadge{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
