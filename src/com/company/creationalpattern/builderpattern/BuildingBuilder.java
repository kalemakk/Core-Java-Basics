package com.company.creationalpattern.builderpattern;

import java.awt.*;

public class BuildingBuilder {
    private Color wallColor;
    private Dimension dimension;
    private int numberOfRooms;
    private String locationName;

    public BuildingBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        System.out.println("............................here.......................");
        System.out.println(this);
        return this;
    }

    public BuildingBuilder setDimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }

    public BuildingBuilder setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        return this;
    }

    public BuildingBuilder setLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }

    public Building createBuilding() {
        return new Building(wallColor, dimension, numberOfRooms, locationName);
    }
}