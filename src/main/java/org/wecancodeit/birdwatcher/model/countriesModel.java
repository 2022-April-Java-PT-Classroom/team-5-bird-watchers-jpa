package org.wecancodeit.birdwatcher.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class countriesModel {

    @Id
    @GeneratedValue
    private Long id;
    private String countryName;
    private String description;
    private String imageUrl;
    @ManyToOne
    private ContinentModel continent; //once continent class is merged, import the class.
    @ManyToMany
    private Collection<regionModel> regions; //couldn't see where Region class was at, so I left it red.

    public Long getId(){
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public ContinentModel getContinent(){
        return continent;
    }

    public Collection<regionModel> getRegions(){
        return regions;
    }

    public countriesModel(){

    }

    public countriesModel(String countryName, String description, String imageUrl, ContinentModel continent, regionModel ... regions){
        this.id = id;
        this.countryName = countryName;
        this.description = description;
        this.imageUrl = imageUrl;
        this.continent = continent;
        this.regions = new ArrayList<>(Arrays.asList(regions));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        countriesModel CountriesModel = (countriesModel) o;
        return Objects.equals(id, CountriesModel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
