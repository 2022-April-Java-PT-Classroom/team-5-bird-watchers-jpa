package org.wecancodeit.birdwatcher.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class ContinentModel {
    @Id @GeneratedValue
    private Long id;
    private String name;
    @Lob
    private String description;
    private String imageUrl;
    @OneToMany(mappedBy = "continent")
    private Collection<countriesModel> countries;

    protected ContinentModel(){}

    public ContinentModel(String name, String description, String imageUrl, countriesModel...countries) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.countries = List.of(countries);
    }

    public Long getId() {return id;}

    public String getName() {return name;}

    public String getDescription() {return description;}

    public String getImageUrl() {return imageUrl;}

    public Collection<countriesModel> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return String.format("Continent{id=%d, name='%s', imageUrl='%s'}", id, name, imageUrl);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContinentModel)) return false;
        ContinentModel continentModel = (ContinentModel) o;
        return Objects.equals(id, continentModel.id) && Objects.equals(name, continentModel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
