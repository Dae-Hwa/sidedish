package com.codesquad.sidedish.web.sidedish.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.HashSet;
import java.util.Set;

public class SidedishCategory {
    @Id
    private Long id;
    private String name;
    private Boolean isBest;
    @MappedCollection(idColumn = "SIDEDISH_CATEGORY_ID")
    private Set<Sidedish> sidedishes = new HashSet<>();

    public SidedishCategory(String name, boolean isBest) {
        this.name = name;
        this.isBest = isBest;
    }

    public SidedishCategory addSidedishes(Sidedish... foods) {
        for (Sidedish f : foods) {
            this.sidedishes.add(f);
        }

//        sidedishes.addAll(Arrays.asList(foods));
        return this;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean isBest() {
        return isBest;
    }

    public Set<Sidedish> getSidedishes() {
        return sidedishes;
    }

    @Override
    public String toString() {
        return "SidedishCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isBest=" + isBest +
                ", sidedishes=" + sidedishes +
                '}';
    }
}
