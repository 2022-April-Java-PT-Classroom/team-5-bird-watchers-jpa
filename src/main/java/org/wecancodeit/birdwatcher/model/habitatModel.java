package org.wecancodeit.birdwatcher.model;

import javax.persistence.*;
import javax.swing.plaf.synth.Region;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class habitatModel {

    @Id
    @GeneratedValue
    private Long id;
    private String habitatName;
    private String description;
    private String imageUrl;

    @ManyToOne
    private regionModel region;
    @ManyToMany
    private Collection<BirdModel> birds;

    private Long getId(){
        return id;
    }

    public String getHabitatName(){
        return habitatName;
    }

    public String getDescription(){
        return description;
    }

    public String getImageUrl(){
        return imageUrl;
    }
    public regionModel getRegion(){
        return region;
    }

    public Collection<BirdModel> getBirds() {
        return birds;
    }

    public habitatModel(){

    }


    public habitatModel(Long id, String habitatName, String description, String imageUrl, regionModel region, BirdModel... birds){

       this.id = id;
       this.habitatName = habitatName;
       this.description = description;
       this.imageUrl = imageUrl;
       this.region = region;
       this.birds = new ArrayList<>(Arrays.asList(birds));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        habitatModel HabitatModel = (habitatModel) o;
        return Objects.equals(id, HabitatModel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
