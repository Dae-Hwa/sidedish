package com.codesquad.sidedish.web.sidedish.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SidedishCategory {
    @Id
    private Long id;
    private String name;
    private boolean isBest;
    @MappedCollection(idColumn = "SIDEDISH_CATEGORY_ID")
    private Set<Sidedish> sidedishes = new HashSet<>();

    public SidedishCategory(String name, boolean isBest) {
        this.name = name;
        this.isBest = isBest;
    }

    public SidedishCategory addSidedishes(Collection<Sidedish> sidedishes) {
        this.sidedishes.addAll(sidedishes);
        return this;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isBest() {
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
