package org.wecancodeit.birdwatcher.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class regionModel {

    @Id
    @GeneratedValue
    private Long id;
    private String regionName;
    private String countryName;
    private String population;
    private String climate;

    //Constructor
    public regionModel(String regionName, String countryName, String population, String climate) {
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.climate = climate;
    }
    //---------------------------------------

    //Getters
    public Long getId() {
        return id;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getPopulation() {
        return population;
    }

    public String getClimate() {
        return climate;
    }
    //--------------------------------------
}
