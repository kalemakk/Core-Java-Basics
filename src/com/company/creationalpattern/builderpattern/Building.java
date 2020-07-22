package com.company.creationalpattern.builderpattern;

import java.awt.*;

public class Building {
    private Color wallColor;
    private Dimension dimension;
    private int numberOfRooms;
    private String locationName;

    Building(Color wallColor,Dimension dimension,int numberOfRooms,String locationName){
        this.wallColor =wallColor;
        this.dimension =dimension;
        this.numberOfRooms =numberOfRooms;
        this.locationName=locationName;
    }

    @Override
    public String toString() {
        return dimension.toString();
    }
}
