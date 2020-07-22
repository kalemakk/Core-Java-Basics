package com.company.creationalpattern.builderpattern;

import java.awt.*;

public class Architecture {
    public static void main(String[] args) {
        Building building = new BuildingBuilder().setWallColor(Color.black).setDimension(new Dimension(100, 230)).setNumberOfRooms(4).setLocationName("Kampala").createBuilding();
        Building building1= new BuildingBuilder().setDimension(new Dimension(100,20)).createBuilding();
        System.out.println(building1);

    }
}
