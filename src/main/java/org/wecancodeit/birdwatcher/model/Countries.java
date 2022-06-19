package org.wecancodeit.birdwatcher.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Countries {

    @Id
    @GeneratedValue
    private Long id;
    private String countryName;
    private String description;
    private String imageUrl;
    @ManyToOne
    private Continent continent; //once continent class is merged, import the class.
//    @ManyToMany
    private Region regions; //couldn't see where Region class was at, so I left it red.

    public Long getId(){
        return id;
    }

    public String getName() {
        return countryName;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Continent getContinent(){
        return continent;
    }

    public Region getRegions(){
        return regions;
    }

    public Countries(){

    }

    public Countries(Long id, String countryName, String description, String imageUrl, Continent continent, Region regions){
        this.id = id;
        this.countryName = countryName;
        this.description = description;
        this.imageUrl = imageUrl;
        this.continent = continent;
        this.regions = regions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Countries Countries = (Countries) o;
        return Objects.equals(id, Countries.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
