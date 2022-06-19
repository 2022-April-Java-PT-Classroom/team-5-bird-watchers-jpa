package org.wecancodeit.birdwatcher.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class BirdModel {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Lob
    private String description;
    private String imageUrl;
    @ManyToMany
    private Collection<habitatModel> habitats;

    public BirdModel() {
    }

    public BirdModel(String name, String description, String imageUrl, habitatModel... habitats) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.habitats = new ArrayList<>(Arrays.asList(habitats));
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

    public String getImageUrl() {
        return imageUrl;
    }

    public Collection<habitatModel> getHabitats() {
        return habitats;
    }

    @Override
    public String toString() {
        return "BirdModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BirdModel)) return false;
        BirdModel birdModel = (BirdModel) o;
        return Objects.equals(id, birdModel.id) && Objects.equals(name, birdModel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}