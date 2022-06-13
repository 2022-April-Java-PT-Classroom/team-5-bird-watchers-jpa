package org.wecancodeit.birdwatcher;

public class regionModel {

    private Long id;
    private String regionName;
    private String description;

    public regionModel(Long id, String regionName, String description) {
        this.id = id;
        this.regionName = regionName;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getDescription() {
        return description;
    }
}
