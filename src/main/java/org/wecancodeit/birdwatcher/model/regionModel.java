package org.wecancodeit.birdwatcher.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class regionModel {

    @Id
    @GeneratedValue
    private Long id;
    private String regionName;
    private String countryName;
    private String imageUrl;
    @Lob
    private String population;
    private String climate;

    @OneToOne
    private countriesModel countries;
    @OneToMany
    private Collection<habitatModel> habitats;

    //Constructor
    public regionModel(String regionName, String countryName, String population, String climate,String imageUrl,countriesModel countries, habitatModel ... habitats) {
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.climate = climate;
        this.imageUrl= imageUrl;
        this.habitats= new ArrayList<>(Arrays.asList(habitats));
    }
   public regionModel(){}

    //Getters
    public Long getId() {
        return id;
    }

    public String getImageUrl(){return imageUrl;}

    public String getRegionName() {
        return regionName;
    }

    public String getCountryName() {return countryName;}

    public String getPopulation() {
        return population;
    }

    public String getClimate() {return climate;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        regionModel regionModel = (regionModel) o;
        return Objects.equals(id, regionModel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
