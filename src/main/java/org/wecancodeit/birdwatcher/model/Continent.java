package org.wecancodeit.birdwatcher.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class Continent {
    @Id @GeneratedValue
    private Long id;
    private String name;
    @Lob
    private String description;
    private String imageUrl;
    @OneToMany(mappedBy = "Countries")
    private Collection<Countries> countries;

    protected Continent(){}

    public Continent(String name, String description, String imageUrl, Countries...countries) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.countries = List.of(countries);
    }

    public Long getId() {return id;}

    public String getName() {return name;}

    public String getDescription() {return description;}

    public String getImageUrl() {return imageUrl;}

    public Collection<Countries> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return String.format("Continent{id=%d, name='%s', imageUrl='%s'}", id, name, imageUrl);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent continent = (Continent) o;
        return Objects.equals(id, continent.id) && Objects.equals(name, continent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
